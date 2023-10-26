//Pacote
package Factory;

//Importações
import java.sql.Connection;
import java.sql.SQLException;

/**
 *
 * @author Felipe
 */
public class TestConnection {
    public void testConnection() throws SQLException{
        Connection link = new ConnectionFactory().getConnection();
        System.out.println("Conexão aberta");
        link.close();
    }
}
