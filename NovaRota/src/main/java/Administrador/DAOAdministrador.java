/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Administrador;

import Funcionario.Funcionario;
import Factory.ConnectionFactory;
import Usuario.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashSet;

/**
 *
 * @author USUARIO
 */
public class DAOAdministrador {
    
    ResultSet rs;
    
    private Connection link;
    
    public DAOAdministrador(){
        this.link = new ConnectionFactory().getConnection();
    }
    
    public void Create(Funcionario f){
        String sql = "INSERT INTO Funcionario (func_id, func_nome, func_cpf, func_email, func_senha)";
        
        try{
            PreparedStatement stmt = link.prepareStatement(sql);
            stmt.setInt(1,f.getIDFuncionario());
            stmt.setString(2,f.getNome());
            stmt.setLong(3, f.getCpf());
            stmt.setString(4,f.getEmail());
            stmt.setString(5,f.getSenha());
            stmt.execute();
            stmt.close();
        }
        catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    
    public void Remove(Administrador a) {
        String sql = "DELETE FROM Funcionario WHERE func_id = ?";
        try {
            PreparedStatement stmt = link.prepareStatement(sql);
            stmt.setInt(1, a.getIDFuncionario());

            stmt.execute();
            stmt.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    
     public void Update(Administrador a) {
        String sql = "UPDATE Funcionario set func_nome = ?, func_cpf =  ?, func_email = ?, func_senha = ? where func_id = ?";

        try {
            PreparedStatement stmt = link.prepareStatement(sql);

            stmt.setString(1, a.getNome());
            stmt.setLong(2, a.getCpf());
            stmt.setString(3, a.getEmail());
            stmt.setString(4, a.getSenha());
            stmt.setInt(5, a.getIDFuncionario());

            stmt.execute();
            stmt.close();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
