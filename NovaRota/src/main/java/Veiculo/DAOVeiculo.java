/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Veiculo;


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
public class DAOVeiculo {
    ResultSet rs;
    private Connection link;
    ArrayList<Veiculo> lista = new ArrayList();

    public DAOVeiculo() {
        this.link = new ConnectionFactory().getConnection();
    }

    public void Create(Veiculo v) {
        String sql = "INSERT INTO Veiculo (vei_placa, vei_marca, vei_modelo, vei_ano,vei_cor) VALUES(?,?,?,?,?)";
        try {
            PreparedStatement stmt = link.prepareStatement(sql);
            stmt.setString(1, v.getPlaca());
            stmt.setString(2, v.getMarca());
            stmt.setString(3, v.getModelo());
            stmt.setInt(4, v.getAno());
            stmt.setString(5, v.getCor());
            stmt.execute();
            stmt.close();
            JOptionPane.showMessageDialog(null, "Veículo cadastrado com sucesso!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e, "Erro!", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void Remove(String vei_placa) {
        String sql = "DELETE FROM Veiculo WHERE vei_placa = ?";
        try {
            PreparedStatement stmt = link.prepareStatement(sql);
            stmt.setString(1, vei_placa);
            stmt.execute();
            stmt.close();            
            JOptionPane.showMessageDialog(null, "Veículo removido com sucesso!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e, "Erro!", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void Update(Veiculo v) {
        String sql = "UPDATE Veiculo set vei_marca = ?, vei_modelo= ?, vei_ano=  ?, vei_cor = ? where vei_placa = ?";
        try {
            PreparedStatement stmt = link.prepareStatement(sql);
            stmt.setString(1, v.getMarca());
            stmt.setString(2, v.getModelo());
            stmt.setInt(3, v.getAno());
            stmt.setString(4, v.getCor());
            stmt.setString(5, v.getPlaca());
            stmt.execute();
            stmt.close();            
            JOptionPane.showMessageDialog(null, "Veículo atualizado com sucesso!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e, "Erro!", JOptionPane.ERROR_MESSAGE);
        }
    }

    public ArrayList<Veiculo> Display() {
        String sql = "select * from Veiculo";
        try {
            PreparedStatement stmt = link.prepareStatement(sql);
            rs = stmt.executeQuery();
            while (rs.next()) {
                Veiculo objveiculo = new Veiculo();
                objveiculo.setPlaca(rs.getString("vei_placa"));
                objveiculo.setMarca(rs.getString("vei_marca"));
                objveiculo.setModelo(rs.getString("vei_modelo"));
                objveiculo.setAno(rs.getInt("vei_ano"));
                objveiculo.setCor(rs.getString("vei_cor"));
                lista.add(objveiculo);
            }
            JOptionPane.showMessageDialog(null, "Veículos recuperados com sucesso!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e, "Erro!", JOptionPane.ERROR_MESSAGE);
        }
        return lista;
    }
}
