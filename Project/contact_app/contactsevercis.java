package contact_app;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ContactJDBC {
   public static void main(String[] args) {
        String url = "jbc:mysql://localhost:3306/compay";
        String username = "root";
        String password = "1234567890";

        try(Connection conn = DriverManager.getConnection(url,username,password)){
            System.out.println("Connected to the database");
       }catch (SQLException e){
            System.out.println("Connection failed " + e.getMessage());
        }
    }
}
