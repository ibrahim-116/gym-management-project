
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author HAAN LAPTOP STORE
 */
public class UpdateandDelete_Class {
     
    private String name;
    private String gender;
    private String mobile_no;
    private String age;
    private String weight;
    private String email_address;
    private String gym_time;
    private String date;
    private String amount;
    private String address;
    private String cnic;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getMobile_no() {
        return mobile_no;
    }

    public void setMobile_no(String mobile_no) {
        this.mobile_no = mobile_no;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getEmail_address() {
        return email_address;
    }

    public void setEmail_address(String email_address) {
        this.email_address = email_address;
    }

    public String getGym_time() {
        return gym_time;
    }

    public void setGym_time(String gym_time) {
        this.gym_time = gym_time;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCnic() {
        return cnic;
    }

    public void setCnic(String cnic) {
        this.cnic = cnic;
    }

    public void updateAndDelete(String name, String age, String weight, String gender, String amount, String address, String email_address, String gym_time, String date, String cnic) {
    this.name = name;
    this.age = age;
    this.weight = weight;
    this.gender = gender;
    this.amount = amount;
    this.address = address;
    this.email_address = email_address;
    this.gym_time = gym_time;
    this.date = date;
    this.cnic = cnic;
}

    
    
    
      public void populateTable(DefaultTableModel tableModel, String mobile){

Connection connection;
    try {
        connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/gym_db", "root", "ibrahimmuhammad+1");
        
        Statement statement = connection.createStatement();
        
        String qry = "Select * from customer_detail where mobile_no = '" + mobile + "'";
        
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
       
       String tblData[] = {name, age, weight, gender, email_address, date, gym_time, cnic, mobile_no, amount, address  };
       
       tableModel.addRow(tblData);
       
       
        
        
        
        }
        
        
        
    } catch (SQLException ex) {
        Logger.getLogger(ListOfCustomers_Frame.class.getName()).log(Level.SEVERE, null, ex);
    }
      }
    
    
     void  DeleteData( String Mobile_no ) {
         //Working Correctly
        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/gym_db", "root", "ibrahimmuhammad+1");
            Statement statement = connection.createStatement();
            
        String qry = "DELETE FROM customer_detail WHERE mobile_no = '" + Mobile_no + "'";
            
            
             statement.executeUpdate(qry);
           
            
            
            
        } catch (SQLException ex) {
            System.out.println("Error connecting to the database: " + ex.getMessage());
         
        }
       
    }
     
    void UpdateData(String Name, String Age, String Weight, String Gender, String Email_address, String Date, String Gym_time, String CNIC, String Mobile_noFinding, String Mobile_noUpdating, String Amount, String Address){
    //Working Correctly
       try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/gym_db", "root", "ibrahimmuhammad+1");
            Statement statement = connection.createStatement();
            
String qry = "UPDATE customer_detail SET weight = '" + Weight + "', name = '" + Name + "', age = '" + Age + "', gender = '" + Gender + "', email_address = '" + Email_address + "', date = '" + Date + "', gym_time = '" + Gym_time + "', cnic = '" + CNIC + "', amount = '" + Amount + "', mobile_no = '" + Mobile_noUpdating  + "', address = '" + Address + "' WHERE mobile_no = '" + Mobile_noFinding + "'";
            
            
             statement.executeUpdate(qry);
           
            
            
            
        } catch (SQLException ex) {
            System.out.println("Error connecting to the database: " + ex.getMessage());
         
        }
    }
        void SearchData(String mobileNoFinding, DefaultTableModel tbl){
            //Working Correctly
            try{
            Connection connection;
           
                connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/gym_db", "root", "ibrahimmuhammad+1");
            
            Statement statement = connection.createStatement();
      String qry = "SELECT * FROM customer_detail WHERE mobile_no = '" + mobileNoFinding + "'";
        ResultSet resultSet = statement.executeQuery(qry);

        
            while(resultSet.next()){
            String name = resultSet.getString("name");
            String age = resultSet.getString("age");
            String weight = resultSet.getString("weight");
            String gender = resultSet.getString("gender");
            String email = resultSet.getString("email_address");
            String date = resultSet.getString("date");
            String gymTime = resultSet.getString("gym_time");
            String cnic = resultSet.getString("cnic");
            String mobile_no = resultSet.getString("mobile_no");
            String amount = resultSet.getString("amount");
            String address = resultSet.getString("address");
            String data[] = {name, age, weight, gender, email, date, gymTime, cnic, mobile_no, amount, address};
            
            tbl.addRow(data);
            
            
            
        } 
            
       
            }
        catch (SQLException ex) {
                Logger.getLogger(UpdateandDelete_Class.class.getName()).log(Level.SEVERE, null, ex);
            }
            
           
}
}
    
    
    
    
    

