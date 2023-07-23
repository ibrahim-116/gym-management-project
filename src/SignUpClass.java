
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author HAAN LAPTOP STORE
 */
public class SignUpClass {
    private String email;
  private  String password;
    
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    void insertSingup(String email, String password){
      try {
          
          Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/gym_db", "root", "ibrahimmuhammad+1");
          Statement statement = con.createStatement();
          String qry = "insert into admin_details (email, password) values( '"+email+"','"+password+"')";
          statement.executeUpdate(qry);
          
      } 
      
      
    
      catch (SQLException ex) {
          System.out.println(ex);
      }
    }
       void DeleteAccount(){
      try {
          
       Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/gym_db", "root", "ibrahimmuhammad+1");
        Statement statement = con.createStatement();
        String qry = "delete from admin_details";
        statement.executeUpdate(qry);
      } 
      
      
     
      catch (SQLException ex) {
          System.out.println(ex);
      }
      
       
               
    }
    
}
