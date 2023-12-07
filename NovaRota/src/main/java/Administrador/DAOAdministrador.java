/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Administrador;

import Factory.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;


/*
 *
 * @author Guilherme
 * 
 */
public class DAOAdministrador {
    ResultSet rs;
    private Connection link;
    ArrayList<Administrador> lista = new ArrayList();
    
    public DAOAdministrador(){
        this.link = new ConnectionFactory().getConnection();
    }
    
    public void Create(Administrador a){
        String sql = "INSERT INTO Administrador(adm_id, adm_nome, adm_cpf, adm_email,adm_senha) VALUES(?,?,?,?,?)";
        try {
            PreparedStatement stmt = link.prepareStatement(sql);
            stmt.setInt(1, a.getIDAdministrador());
            stmt.setString(2, a.getNome());
            stmt.setLong(3, a.getCpf());
            stmt.setString(4, a.getEmail());
            stmt.setString(5,a.getSenha());
            stmt.execute();
            stmt.close();
            JOptionPane.showMessageDialog(null, "Administrador cadastrado com sucesso!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e, "Erro!", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void Remove(int idAdm) {
        String sql = "DELETE FROM Administrador WHERE adm_id= ?";
        try {
            PreparedStatement stmt = link.prepareStatement(sql);
            stmt.setInt(1, idAdm);
            stmt.execute();
            stmt.close();
            JOptionPane.showMessageDialog(null, "Administrador excluido com sucesso!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e, "Erro!", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void Update(Administrador a) {
        String sql = "UPDATE Administrador set adm_nome = ?, adm_cpf =  ?, adm_email = ?, adm_senha = ? where adm_id = ?";
        try {
            PreparedStatement stmt = link.prepareStatement(sql);
            stmt.setString(1, a.getNome());
            stmt.setLong(2, a.getCpf());
            stmt.setString(3, a.getEmail());
            stmt.setString(4,a.getSenha());
            stmt.setInt(5, a.getIDAdministrador());
            stmt.execute();
            stmt.close();
            JOptionPane.showMessageDialog(null, "Administrador atualizado com sucesso!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e, "Erro!", JOptionPane.ERROR_MESSAGE);
        }
    }
     
    public ArrayList<Administrador> Display() {
        String sql = "select * from Administrador";
        try {
            PreparedStatement stmt = link.prepareStatement(sql);
            rs = stmt.executeQuery();
            while (rs.next()) {
                Administrador objadministrador = new Administrador();
                objadministrador.setIDAdministrador(rs.getInt("adm_id"));
                objadministrador.setNome(rs.getString("adm_nome"));
                objadministrador.setCpf(rs.getLong("adm_cpf"));
                objadministrador.setEmail(rs.getString("adm_email"));
                objadministrador.setSenha(rs.getString("adm_senha"));
                lista.add(objadministrador);
            }
            JOptionPane.showMessageDialog(null, "Administradores recuperados com sucesso!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);    
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e, "Erro!", JOptionPane.ERROR_MESSAGE);
        }
        return lista;
    }  
}
