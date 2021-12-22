
package Project;
import java.sql.*;


/**
 *
 * @author hp
 */
public class ConnectionProvider {
    public static Connection getCon()
    {
        try{
              Class.forName("com.mysql.jdbc.Driver");
             Connection con = DriverManager.getConnection("jdbc:mysql://localhost/hms", "root", "");
                System.out.println("(DB Connected):");
        }
        catch(Exception e)
        {
            return null;
        }
        return null;
    }
}
