import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;

public class MySQLConnection {

    // Database connection parameters
    private static final String URL = "jdbc:mysql://localhost:3306/startersql";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "root";

    public static void main(String[] args) {
        Connection connection = null;

        try {
            // Connect to MySQL
            connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            System.out.println("✓ Connected to MySQL successfully!");

            // Example: Execute a query
            String query = "SELECT * FROM users ";
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query);

            // Get metadata to display all columns
            ResultSetMetaData metadata = resultSet.getMetaData();
            int columnCount = metadata.getColumnCount();

            // Print column headers
            for (int i = 1; i <= columnCount; i++) {
                System.out.print(metadata.getColumnName(i) + "\t");
            }
            System.out.println();

            // Process results and print all columns
            while (resultSet.next()) {
                for (int i = 1; i <= columnCount; i++) {
                    System.out.print(resultSet.getString(i) + "\t");
                }
                System.out.println();
            }

            resultSet.close();
            statement.close();

        } catch (SQLException e) {
            System.err.println("✗ Connection failed!");
            e.printStackTrace();
        } finally {
            // Close connection
            if (connection != null) {
                try {
                    connection.close();
                    System.out.println("✓ Connection closed.");
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
