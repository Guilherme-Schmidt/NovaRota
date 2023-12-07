/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Usuario;

import Factory.ConnectionFactory;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;


/**
 *
 * @author USUARIO
 */
public class DAOUsuario {
    private Connection link;
    
    public DAOUsuario (){
        this.link = new ConnectionFactory().getConnection();
    }
    
    public ResultSet autenticacaoUsuario(Usuario objusuario){
        try{
          String sql = "select * from Usuario where nome = ? and senha = ?";
          
          PreparedStatement pstm = link.prepareStatement(sql);
          pstm.setString(1, objusuario.getNome());
          pstm.setString(2, objusuario.getSenha());
          
          ResultSet rs = pstm.executeQuery();
          return rs;
          
        }catch(SQLException erro){
            JOptionPane.showMessageDialog(null,"Usuario: "+erro);
            return null;
        }
    }
}
