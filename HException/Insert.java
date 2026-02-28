package HException;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Insert {
    private static final String URL = "jdbc:mysql://localhost:3306/startersql";
    private static final String use = "root";
    private static final String password = "1234567890";

    public static void main(String[] args) {

        try (Connection con = DriverManager.getConnection(URL, use, password);
             Statement stmt = con.createStatement()) {
            String sql = "Insert into users(id,name,email,gender, date_of_birth,salary ) values(26,'Rafee','raafee@gmail.com','male', '2004-02-01', 870000)";
            int row = stmt.executeUpdate(sql);
            if (row > 0 ){
                System.out.println("Insert Sucessfull. " + row );
            }else {
                System.out.println("Inert error");
            }

        }catch (SQLException e){
            System.out.println("Error insert " + e.getMessage());
        }
    }
}

