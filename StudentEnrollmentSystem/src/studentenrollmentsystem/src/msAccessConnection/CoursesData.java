
package msAccessConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CoursesData {
    
    private Connection getConnection() throws SQLException {
        String url = "jdbc:ucanaccess://C:\\Users\\User\\Documents\\NetBeansProjects\\StudentEnrollmentSystem\\studentEnrollmentDatabase.accdb"; 
        return DriverManager.getConnection(url);
    }

    // Create
    public boolean addCourse(String courseName, String courseDescription) {
        String query = "INSERT INTO Courses (courseName, courseDescription) VALUES (?, ?)";

        try (Connection conn = getConnection();
             PreparedStatement stmt = conn.prepareStatement(query)) {

            stmt.setString(1, courseName);
            stmt.setString(2, courseDescription);

            int rowsInserted = stmt.executeUpdate();
            return rowsInserted > 0;

        } catch (SQLException ex) {
            ex.printStackTrace();
            return false;
        }
    }

    // Read
    public ResultSet getAllCourses() {
        String query = "SELECT * FROM Courses";

        try (Connection conn = getConnection();
             PreparedStatement stmt = conn.prepareStatement(query)) {

            return stmt.executeQuery();

        } catch (SQLException ex) {
            ex.printStackTrace();
            return null;
        }
    }

    // Update
    public boolean updateCourse(int courseID, String courseName, String courseDescription) {
        String query = "UPDATE Courses SET courseName = ?, courseDescription = ? WHERE courseID = ?";

        try (Connection conn = getConnection();
             PreparedStatement stmt = conn.prepareStatement(query)) {

            stmt.setString(1, courseName);
            stmt.setString(2, courseDescription);
            stmt.setInt(3, courseID);

            int rowsUpdated = stmt.executeUpdate();
            return rowsUpdated > 0;

        } catch (SQLException ex) {
            ex.printStackTrace();
            return false;
        }
    }

    // Delete
    public boolean removeCourse(int courseID) {
        String query = "DELETE FROM Courses WHERE courseID = ?";

        try (Connection conn = getConnection();
             PreparedStatement stmt = conn.prepareStatement(query)) {

            stmt.setInt(1, courseID);

            int rowsDeleted = stmt.executeUpdate();
            return rowsDeleted > 0;

        } catch (SQLException ex) {
            ex.printStackTrace();
            return false;
        }
    }
}
