//Pacote
package Cliente;

//Importações
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
public class DAOCliente {
    ResultSet rs;
    private Connection link;
    ArrayList<Cliente> lista = new ArrayList();

    public DAOCliente() {
        this.link = new ConnectionFactory().getConnection();
    }

    public void Create(Cliente c) {
        String sql = "INSERT INTO cliente(cli_id, cli_nome, cli_cpf, cli_email) VALUES(?,?,?,?)";
        try {
            PreparedStatement stmt = link.prepareStatement(sql);
            stmt.setInt(1, c.getIDCliente());
            stmt.setString(2, c.getNome());
            stmt.setLong(3, c.getCpf());
            stmt.setString(4, c.getEmail());
            stmt.execute();
            stmt.close();
            JOptionPane.showMessageDialog(null, "Cliente cadastrado com sucesso!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e, "Erro!", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void Remove(int idCliente) {
        String sql = "DELETE FROM cliente WHERE cli_id = ?";
        try {
            PreparedStatement stmt = link.prepareStatement(sql);
            stmt.setInt(1, idCliente);
            stmt.execute();
            stmt.close();
            JOptionPane.showMessageDialog(null, "Cliente excluído com sucesso!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e, "Erro!", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void Update(Cliente c) {
        String sql = "UPDATE Cliente set cli_nome = ?,  cli_cpf =  ?,cli_email = ? where cli_id = ?";
        try {
            PreparedStatement stmt = link.prepareStatement(sql);
            stmt.setString(1, c.getNome());
            stmt.setLong(2, c.getCpf());
            stmt.setString(3, c.getEmail());
            stmt.setInt(4, c.getIDCliente());
            stmt.execute();
            stmt.close();
            JOptionPane.showMessageDialog(null, "Cliente atualizado com sucesso!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e, "Erro!", JOptionPane.ERROR_MESSAGE);
        }
    }

    public ArrayList<Cliente> Display() {
        String sql = "select * from cliente";
        try {
            PreparedStatement stmt = link.prepareStatement(sql);
            rs = stmt.executeQuery();
            while (rs.next()) {
                Cliente objcliente = new Cliente();
                objcliente.setIDCliente(rs.getInt("cli_id"));
                objcliente.setNome(rs.getString("cli_nome"));
                objcliente.setEmail(rs.getString("cli_email"));
                objcliente.setCpf(rs.getLong("cli_cpf"));
                lista.add(objcliente);
            }
            JOptionPane.showMessageDialog(null, "Clientes recuperados com sucesso!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e, "Erro!", JOptionPane.ERROR_MESSAGE);
        }
        return lista;
    }

}
