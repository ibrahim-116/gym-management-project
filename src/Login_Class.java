
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
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
public class Login_Class {
    private String email;
    private String password;

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
    
    
    String getEmailfromDB(){
        String emailfromdatabase = null;
       Connection connection;
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/gym_db","root", "ibrahimmuhammad+1");
            Statement statement = connection.createStatement();
            String qry= "select email from admin_details limit 1";
            ResultSet rs = statement.executeQuery(qry);
            while(rs.next()){
               emailfromdatabase = rs.getString("email");
              
              
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        
         return emailfromdatabase;
    }
        String getPasswordfromDB(){
        String passwordfromdatabase = null;
       Connection connection;
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/gym_db","root", "ibrahimmuhammad+1");
            Statement statement = connection.createStatement();
            String qry= "select password from admin_details limit 1";
            ResultSet rs = statement.executeQuery(qry);
            while(rs.next()){
               passwordfromdatabase = rs.getString("password");
              
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        
         return passwordfromdatabase;
    }
    
    
}
