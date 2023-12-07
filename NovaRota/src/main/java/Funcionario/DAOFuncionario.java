package Funcionario;

import Factory.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Felipe
 */
public class DAOFuncionario {
    ResultSet rs;
    private Connection link;
    ArrayList<Funcionario> lista = new ArrayList();
    
    public DAOFuncionario(){
        this.link = new ConnectionFactory().getConnection();
    }
    
    public void Create(Funcionario f){
        String sql = "INSERT INTO funcionario(func_id, func_nome, func_cpf, func_email, func_senha) VALUES(?,?,?,?,?)";
        try{
            PreparedStatement stmt = link.prepareStatement(sql);
            stmt.setInt(1,f.getIDFuncionario());
            stmt.setString(2,f.getNome());
            stmt.setLong(3, f.getCpf());
            stmt.setString(4,f.getEmail());
            stmt.setString(5,f.getSenha());
            stmt.execute();
            stmt.close();            
            JOptionPane.showMessageDialog(null, "Funcionário cadastrado com sucesso!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e, "Erro!", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void Remove(int idFunc) {
        String sql = "DELETE FROM Funcionario WHERE func_id = ?";
        try {
            PreparedStatement stmt = link.prepareStatement(sql);
            stmt.setInt(1, idFunc);
            stmt.execute();
            stmt.close();            
            JOptionPane.showMessageDialog(null, "Funcionário excluido com sucesso!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e, "Erro!", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void Update(Funcionario f) {
        String sql = "UPDATE Funcionario set func_nome = ?, func_cpf =  ?, func_email = ?, func_senha = ? where func_id = ?";
        try {
            PreparedStatement stmt = link.prepareStatement(sql);
            stmt.setString(1, f.getNome());
            stmt.setLong(2, f.getCpf());
            stmt.setString(3, f.getEmail());
            stmt.setString(4, f.getSenha());
            stmt.setInt(5, f.getIDFuncionario());
            stmt.execute();
            stmt.close();            
            JOptionPane.showMessageDialog(null, "Funcionário atualizado com sucesso!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e, "Erro!", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public ArrayList<Funcionario> Display() {
        String sql = "select * from Funcionario";
        try {
            PreparedStatement stmt = link.prepareStatement(sql);
            rs = stmt.executeQuery();
            while (rs.next()) {
                Funcionario objfuncionario = new Funcionario();
                objfuncionario.setIDFuncionario(rs.getInt("func_id"));
                objfuncionario.setNome(rs.getString("func_nome"));
                objfuncionario.setEmail(rs.getString("func_email"));
                objfuncionario.setCpf(rs.getLong("func_cpf"));
                lista.add(objfuncionario);
            }
            JOptionPane.showMessageDialog(null, "Funcionários recuperados com sucesso!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e, "Erro!", JOptionPane.ERROR_MESSAGE);
        }
        return lista;
    }
    
     
     
    
}
