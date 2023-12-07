//Pacote
package Cliente;

//Importações
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
 * @author Felipe
 */
public class DAOCliente {

    ResultSet rs;
   

    private Connection link;

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
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void Remove(Cliente c) {
        String sql = "DELETE FROM cliente WHERE cli_id = ?";
        try {
            PreparedStatement stmt = link.prepareStatement(sql);
            stmt.setInt(1, c.getIDCliente());

            stmt.execute();
            stmt.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void Update(Cliente c) {
        String sql = "UPDATE Cliente set cli_nome = ?, cli_email = ?, cli_cpf =  ? where cli_id = ?";

        try {
            PreparedStatement stmt = link.prepareStatement(sql);

            stmt.setString(1, c.getNome());
            stmt.setLong(2, c.getCpf());
            stmt.setString(3, c.getEmail());
            stmt.setInt(4, c.getIDCliente());

            stmt.execute();
            stmt.close();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public Cliente Display(int id) {
        Cliente objcliente = new Cliente();
        String sql = "select * from cliente where cli_id = ?";

        try {
            PreparedStatement stmt = link.prepareStatement(sql);
            rs = stmt.executeQuery();
            while (rs.next()) {
                objcliente.setIDCliente(id);
                stmt.setInt(1, objcliente.getIDCliente());
                objcliente.setNome(rs.getString("cli_nome"));
                objcliente.setEmail(rs.getString("cli_email"));
                objcliente.setCpf(rs.getLong("cli_cpf"));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return objcliente;
    }

}
