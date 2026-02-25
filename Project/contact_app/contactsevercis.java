package contact_app;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class contactsevercis {

    private static String url = "jdbc:mysql://localhost:3306/compay?useSSL=false&serverTimezone=UTC";
    private static  String user = "root";
    private static String password = "1234567890";
    public static void main(String[] args) {
        
        try (Connection conn = DriverManager.getConnection(url,user,password))
             {

        } catch (SQLException e) {
            System.out.println("Connection failed: " + e.getMessage());
        }
    }
}