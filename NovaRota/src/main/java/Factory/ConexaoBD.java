//Pacote
package Factory;

//Importações
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.*;
import java.sql.Statement;
import java.sql.SQLException;

/**
 *
 * @author Felipe
 */
public class ConexaoBD {
    private Connection conn = null;
    private String url = "jdbc:mysql://localhost:3306/novarota";
    private String driver = "com.mysql.cj.jdbc.Driver";
    private String user = "netbeans";
    private String password = "netbeans";
    
    public void Insert(String tabela, int id, String nome, String endereco){
        try {
            String sql = "INSERT INTO " + tabela 
                    + " VALUES (" 
                    + id 
                    + ", '" + nome 
                    + "', '" + endereco
                    + "')";
            execute(sql);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void Select(String tabela){
        try {
            String sql = "SELECT * FROM " + tabela;
            ResultSet rs = select(sql);
            while(rs.next()){
                System.out.println(
                        "ID: " + rs.getString(1) 
                        + "\nNome: " + rs.getString(2)
                        + "\nEndereco: " + rs.getString(3)
                        + "\n");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public Connection create(){
        try{
            Class.forName(driver);
            conn = DriverManager.getConnection(url, user, password);
        }catch(Exception ex){
            System.out.println(ex);
        }
        return conn;
    }

    public ResultSet select(String sql){
        Connection conn = create();
        ResultSet rs = null;
        try{
            Statement st = conn.createStatement();
            rs = st.executeQuery(sql);
        }catch(Exception e){
            System.out.println(e);
        }
        return rs;
    }

    public void execute(String sql){
        Connection conn = create();
        ResultSet rs = null;
        try{
            Statement st = conn.createStatement();
            st.executeUpdate(sql);
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
