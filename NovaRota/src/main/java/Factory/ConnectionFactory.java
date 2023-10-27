//Pacote
package Factory;

//Importações
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Felipe
 */
public class ConnectionFactory {
    private String url = "jdbc:mysql://localhost:3306/novarota";
    private String user = "root";
    private String password = "root";
    
    public Connection getConnection() {
        try {
            return DriverManager.getConnection(url,user,password);
        } catch(SQLException excecao) {
            throw new RuntimeException(excecao);
        }
    }
}
