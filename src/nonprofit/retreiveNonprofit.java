/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nonprofit;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;
 
/**
 *
 * @author Mark's PC
 */
public class retreiveNonprofit {
    
    public void getSingle(){
        
    Connection conn1 = null;    
        
     try {
            // connect way #1
            String url1 = "jdbc:mysql://localhost:3306/test1";
            String user = "root";
            String password = "secret";
 
            conn1 = DriverManager.getConnection(url1, user, password);
            if (conn1 != null) {
                System.out.println("Connected to the database test1");
            } 
        catch (SQLException ex) {
            System.out.println("An error occurred. Maybe user/password is invalid");
            ex.printStackTrace();
        }
    
    }
    
    
}
