
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
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
public class AddCustomer {
       private String Name = null;
     private String Age = null;
     private String Weight = null;
     private String Gender = null;
     private String Email_address = null;
     private String Date = null;
     private String Gym_time = null;
     private String CNIC = null;
    private String Mobile_no = null;
    private String Amount = null;
    private String Address = null;

    public void setName(String Name) {
        this.Name = Name;
    }

    public void setAge(String Age) {
        this.Age = Age;
    }

    public void setWeight(String Weight) {
        this.Weight = Weight;
    }

    public void setGender(String Gender) {
        this.Gender = Gender;
    }

    public void setEmail_address(String Email_address) {
        this.Email_address = Email_address;
    }

    public void setDate(String Date) {
        this.Date = Date;
    }

    public void setGym_time(String Gym_time) {
        this.Gym_time = Gym_time;
    }

    public void setCNIC(String CNIC) {
        this.CNIC = CNIC;
    }

    public void setMobile_no(String Mobile_no) {
        this.Mobile_no = Mobile_no;
    }

    public void setAmount(String Amount) {
        this.Amount = Amount;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }
    int getID(){
        
            int id = 0;
         try {
          Connection  connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/gym_db","root", "ibrahimmuhammad+1");
            Statement statement = connection.createStatement();
            String qry = "select from customer_detail";
            ResultSet rs = statement.executeQuery(qry);
            while(rs.next()){
                id = rs.getInt(1);
            }
         }
            catch (SQLException ex) {
            System.out.println(ex);
        }
         return id;
                    
    }
      void DeleteData(){
        
            
         try {
          Connection  connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/gym_db","root", "ibrahimmuhammad+1");
            Statement statement = connection.createStatement();
            String qry = "delete from customer_detail";
            statement.executeUpdate(qry);
           }
         
            catch (SQLException ex) {
            System.out.println(ex);
        }
         
                    
    }
   
    
    
    
    
    void setDatainDatabase (String Name, String Age, String Weight, String Gender, String Email_address, String Date, String Gym_time,
            String CNIC, String Mobile_no, String Amount, String Address  ){
          Connection connection;
        
           try {
               connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/gym_db","root", "ibrahimmuhammad+1");
           
            Statement statement = connection.createStatement();
            String qry = "INSERT INTO customer_detail (name, age, weight, gender, email_address, date, gym_time, cnic, mobile_no, amount, address ) VALUES ('" + Name + "', '" + Age + "', '" + Weight + "', '"+ Gender +"','"+ Email_address +"','"+ Date +"','"+ Gym_time +"','"+ CNIC +"','"+ Mobile_no +"','"+ Amount +"','"+ Address+"')";
            statement.executeUpdate(qry);
           }
          catch (SQLException ex) {
               Logger.getLogger(AddCustomer.class.getName()).log(Level.SEVERE, null, ex);
           }
        
    }
      
    
       }

    

