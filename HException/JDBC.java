package HException;

import java.awt.*;
import java.net.URL;
import java.sql.*;

public class JDBC {


    public static void main(String[] args) {
         String URl = "jdbc:mysql://localhost:3306/startersql";
         String USER = "root";
         String password = "1234567890";
        String query = "Select * from users";
       try {
           Connection con = DriverManager.getConnection(URl,USER,password);
           Statement stmt = con.createStatement();
           ResultSet rs = stmt.executeQuery(query);
           while (rs.next()){
               int id = rs.getInt("id");
               String name = rs.getString("name");
               String gender = rs.getString("gender");
               String data_of_birth = rs.getString("date_of_birth");
               double salary = rs.getDouble("salary");

               System.out.println("====================");
               System.out.println("id : " + id);
               System.out.println("Name : " + name);
               System.out.println("gender : " + gender);
               System.out.println("date_of_brith : " + data_of_birth);
               System.out.println("Salary :" + salary);

           }
       }catch (SQLException e){
           System.out.println("Error : " + e.getMessage());
       }
    }
}
