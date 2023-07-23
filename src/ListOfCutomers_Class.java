
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;


public class ListOfCutomers_Class {
    public void populateTable(DefaultTableModel tableModel){

Connection connection;
    try {
        connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/gym_db", "root", "ibrahimmuhammad+1");
        
        Statement statement = connection.createStatement();
        
        String qry = "Select * from customer_detail";
        
        ResultSet rs = statement.executeQuery(qry);
        
        while(rs.next()){
       
       
       String name = rs.getString(2);
       
       String age = rs.getString(3);
       
       String weight = rs.getString(4);
       
       String gender = rs.getString(5);
       
       String email_address = rs.getString(6);
       
       String date = rs.getString(7);   
       
       String gym_time = rs.getString(8);
       
       String cnic = rs.getString(9);
       
       String mobile_no = rs.getString(10);
       
       String amount = rs.getString(11);
       
       String address = rs.getString(12);
       
       String fee_status = rs.getString(13);
       
       String tblData[] = {name, age, weight, gender, email_address, date, gym_time, cnic, mobile_no, amount, address, fee_status  };
       
       tableModel.addRow(tblData);
       
       
        
        
        
        }
        
        
        
    } catch (SQLException ex) {
        Logger.getLogger(ListOfCustomers_Frame.class.getName()).log(Level.SEVERE, null, ex);
    }
     

}    
}
