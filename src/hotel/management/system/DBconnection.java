package hotel.management.system;



import com.mysql.cj.jdbc.Driver;
import java.sql.*;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.sql.DriverManager;

public class DBconnection {
    public static Connection connect() throws SQLException{
        Connection conn = null;
        
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel","root","");
            return conn;
        }catch (ClassNotFoundException e){
            JOptionPane.showMessageDialog(null, e);
        }
        
        return conn;
    }
}
