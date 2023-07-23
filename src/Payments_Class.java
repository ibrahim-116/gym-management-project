
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
public class Payments_Class {
     void UpdateFeeStatus(String mobile_no){
          
            try{
            Connection connection;
           
                connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/gym_db", "root", "ibrahimmuhammad+1");
            
            Statement statement = connection.createStatement();
            
         
        String qry = "update  customer_detail set fee_status = 'paid' WHERE mobile_no = '" + mobile_no + "'";
        statement.executeUpdate(qry); }
        catch (SQLException ex) {
                Logger.getLogger(UpdateandDelete_Class.class.getName()).log(Level.SEVERE, null, ex);
            }
            
           
}
    
}
