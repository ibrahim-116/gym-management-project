
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author HAAN LAPTOP STORE
 */
public class PasswordResetClass {
    public void setPassword(String password, String email) {
    Connection connection;
    try {
        connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/gym_db", "root", "ibrahimmuhammad+1");
        Statement statement = connection.createStatement();

        String qry = "UPDATE admin_details SET password = '" + password + "' WHERE email = '" + email + "'";
         statement.executeUpdate(qry);

        
    } catch (SQLException ex) {
        Logger.getLogger(ListOfCustomers_Frame.class.getName()).log(Level.SEVERE, null, ex);
    }


}

}
    

