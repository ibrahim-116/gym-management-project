
import java.sql.*;
import java.sql.Statement;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author HAAN LAPTOP STORE
 */
public class EditAccountClass {
     void UpdateData(String email, String password){
         
         String admin_id = "12";
    
       try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/gym_db", "root", "ibrahimmuhammad+1");
            Statement statement = connection.createStatement();
            
            String qry = "update admin_details set email = '" + email + "', password = '" + password + "' where admin_id =  '"  +admin_id+  "'" ;
            
            
             statement.executeUpdate(qry);
           
            
            
            
        } catch (SQLException ex) {
            System.out.println("Error connecting to the database: " + ex.getMessage());
         
        }
    }

    
}
