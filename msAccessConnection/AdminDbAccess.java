
package msAccessConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class AdminDbAccess {

    private Connection getConnection() throws SQLException {
        String url = "jdbc:ucanaccess://C:\\Users\\User\\Documents\\NetBeansProjects\\StudentEnrollmentSystem\\studentEnrollmentDatabase.accdb"; 
        return DriverManager.getConnection(url);
    }

    public boolean authenticateAdmin(String username, String password) {
        String query = "SELECT * FROM Admin WHERE username = ? AND password = ?";
        
        try (Connection conn = getConnection();
             PreparedStatement stmt = conn.prepareStatement(query)) {
            
            stmt.setString(1, username);
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

