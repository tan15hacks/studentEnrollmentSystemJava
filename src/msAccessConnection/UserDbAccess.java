
package msAccessConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserDbAccess {

    private Connection getConnection() throws SQLException {
        String url = "jdbc:ucanaccess://C:\\Users\\User\\Documents\\NetBeansProjects\\StudentEnrollmentSystem\\studentEnrollmentDatabase.accdb"; 
        return DriverManager.getConnection(url);
    }

    public boolean registerUser(String lastname,String firstname,String middlename, int age, String gender, String birthday, String email, String password) {
        String query = "INSERT INTO Users (lastname,firstname,middlename, age, gender, birthday, email, password) VALUES (?, ?, ?, ?, ?, ?,?,?)";

        try (Connection conn = getConnection();
             PreparedStatement stmt = conn.prepareStatement(query)) {

            stmt.setString(1, lastname);
            stmt.setString(2, firstname);
            stmt.setString(3, middlename);
            stmt.setInt(4, age);
            stmt.setString(5, gender);
            stmt.setString(6, birthday);
            stmt.setString(7, email);
            stmt.setString(8, password);

            int rowsInserted = stmt.executeUpdate();
            return rowsInserted > 0;

        } catch (SQLException ex) {
            ex.printStackTrace();
            return false;
        }
    }

    public boolean authenticateUser(String email, String password) {
        String query = "SELECT * FROM Users WHERE email = ? AND password = ?";
        
        try (Connection conn = getConnection();
             PreparedStatement stmt = conn.prepareStatement(query)) {
            
            stmt.setString(1, email);
            stmt.setString(2, password);
            
            try (ResultSet rs = stmt.executeQuery()) {
                return rs.next(); 
            }
            
        } catch (SQLException ex) {
            ex.printStackTrace();
            return false;
        }
    }
}

