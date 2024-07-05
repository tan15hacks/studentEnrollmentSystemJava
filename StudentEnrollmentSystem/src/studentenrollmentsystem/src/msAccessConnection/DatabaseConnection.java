
package msAccessConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
    private static final String URL = "jdbc:ucanaccess://C:\\Users\\User\\Documents\\NetBeansProjects\\StudentEnrollmentSystem\\studentEnrollmentDatabase.accdb";
    private static Connection connection = null;

    public static Connection getConnection() {
        if (connection == null) {
            try {
                connection = DriverManager.getConnection(URL);
                System.out.println("Connection to database established.");
            } catch (SQLException e) {
                e.printStackTrace();
                System.out.println("Connection to database failed.");
            }
        }
        return connection;
    }
}

