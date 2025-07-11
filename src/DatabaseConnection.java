
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
    private static final String dbName = "librabrydb";
    private static final String path = "jdbc:mysql://localhost:3306/"+ dbName;
    private static final String username = "root";
    private static final String password = "";

    public static Connection connect() throws ClassNotFoundException, SQLException {
        Connection conn = null;
        Class.forName("com.mysql.cj.jdbc.Driver");
        conn = DriverManager.getConnection(path, username, password);
        return conn;
    }
    public static void main (String [] args) {
        try {
            if(DatabaseConnection.connect() != null){
                System.out.println("Connection Successfull.");
            }
            else {
                System.out.println("Connection failed");
            }
        }catch (SQLException e){
            throw new RuntimeException(e);
        }
        catch (ClassNotFoundException e){
            throw new RuntimeException(e);
        }
    }
}