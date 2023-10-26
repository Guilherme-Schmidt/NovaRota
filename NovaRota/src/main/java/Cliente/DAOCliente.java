//Pacote
package Cliente;

//Importações
import Factory.ConnectionFactory;
import Usuario.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Felipe
 */
public class DAOCliente {
    private Connection link;
    
    public DAOCliente (){
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
        
    }

    public Cliente Display(Cliente c) {
        return c;
    }
    
}
