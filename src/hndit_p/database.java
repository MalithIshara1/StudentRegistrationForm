
package hndit_p;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Malith
 */
public class database {
    
    
    
    public static Connection connection(){
    
        try {
            
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/abcd","root","1234");
            return con;
            
        } catch (Exception e) {
            System.out.println(e);
            return null;
        }
    }
}
