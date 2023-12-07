/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Login;

import Factory.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Felipe
 */

public class DAOLogin {
    ResultSet rs;
    private Connection link;
       
    public DAOLogin(){
        this.link = new ConnectionFactory().getConnection();
    }
    
    public int autenticaUsuario(Login l){
        int permissao = 0;
        Login objadm = new Login();
        Login objfunc = new Login();
        PreparedStatement stmt;
        String sql = "SELECT * FROM administrador WHERE adm_id = " + l.getUsuario();        
        try{
            stmt = link.prepareStatement(sql);
            rs = stmt.executeQuery();
            while(rs.next()){
                objadm.setUsuario(rs.getInt("adm_id"));
                objadm.setSenha(rs.getString("adm_senha"));
            }
        }catch (SQLException e){
            JOptionPane.showMessageDialog(null, e, "Erro!", JOptionPane.ERROR_MESSAGE);
        }
        
        sql = "SELECT * FROM funcionario WHERE func_id = " + l.getUsuario();
            
        try{
            stmt = link.prepareStatement(sql);
            rs = stmt.executeQuery();
            while(rs.next()){
                objfunc.setUsuario(rs.getInt("func_id"));
                objfunc.setSenha(rs.getString("func_senha"));
            }
        }catch (SQLException e){
            JOptionPane.showMessageDialog(null, e, "Erro!", JOptionPane.ERROR_MESSAGE);
        }
        
        if(objadm.getUsuario()==l.getUsuario() && objadm.getSenha().equals(l.getSenha())){
            permissao = 1;
            return permissao;
        } else if(objfunc.getUsuario()==l.getUsuario() && objfunc.getSenha().equals(l.getSenha())){
            permissao = 2;
            return permissao;
        } else {
            return permissao;
        }
    }
}