
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author HAAN LAPTOP STORE
 */
public class ForgotPassword_Class {
boolean isEmailInDatabase(String email) {
        Connection connection = null;
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/gym_db", "root", "ibrahimmuhammad+1");
            Statement statement = connection.createStatement();

            String qry = "SELECT * FROM admin_details WHERE email = '" + email + "'";
            ResultSet rs = statement.executeQuery(qry);

            // Check if the result set has any records
            return rs.next();

        } catch (SQLException ex) {
            Logger.getLogger(ListOfCustomers_Frame.class.getName()).log(Level.SEVERE, null, ex);
        }
        

        return false; // Return false if there was an exception or no match found
    }

    // ... Other methods and code ...
}
