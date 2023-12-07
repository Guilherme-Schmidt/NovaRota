/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Locacao;

import Factory.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author USUARIO
 */
public class DAOLocacao {
    ResultSet rs;
    private Connection link;
    ArrayList<Locacao> lista = new ArrayList();
    
    public DAOLocacao(){
        this.link = new ConnectionFactory().getConnection();
    }
     
    public void Create(Locacao l){
        String sql = "INSERT INTO Locacao(loc_id, cli_id, func_id, vei_placa, loc_DataLocacao, loc_DataDevolucao) VALUES(?,?,?,?,?,?)";
        try {
            PreparedStatement stmt = link.prepareStatement(sql);
            stmt.setInt(1, l.getIdlocacao());
            stmt.setInt(2,l.getIdcliente());
            stmt.setInt(3,l.getIdfuncionario());
            stmt.setString(4, l.getPlaca());
            stmt.setString(5, l.getDatalocacao());
            stmt.setString(6, l.getDatadevolucao());
            stmt.execute();
            stmt.close();            
            JOptionPane.showMessageDialog(null, "Locação cadastrada com sucesso!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e, "Erro!", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void Remove(int idLoc) {
        String sql = "DELETE FROM Locacao WHERE loc_id= ?";
        try {
            PreparedStatement stmt = link.prepareStatement(sql);
            stmt.setInt(1, idLoc);
            stmt.execute();
            stmt.close();            
            JOptionPane.showMessageDialog(null, "Locação removida com sucesso!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e, "Erro!", JOptionPane.ERROR_MESSAGE);
        }
    }
   
    public ArrayList<Locacao> Display() {
        String sql = "select * from Locacao";
        try {
            PreparedStatement stmt = link.prepareStatement(sql);
            rs = stmt.executeQuery();
            while (rs.next()) {
                Locacao objlocacao = new Locacao();
                objlocacao.setIdlocacao(rs.getInt("loc_id"));
                objlocacao.setIdfuncionario(rs.getInt("func_id"));
                objlocacao.setIdcliente(rs.getInt("cli_id"));
                objlocacao.setPlaca(rs.getString("vei_placa"));
                objlocacao.setDatalocacao(rs.getString("loc_DataLocacao"));
                objlocacao.setDatadevolucao(rs.getString("loc_DataDevolucao"));
                lista.add(objlocacao);
            }
            JOptionPane.showMessageDialog(null, "Locações recuperadas com sucesso!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e, "Erro!", JOptionPane.ERROR_MESSAGE);
        }
        return lista;
    }
}
