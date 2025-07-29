import java.sql.*;
public class JDBC {
public static void main(String[] args) {
    Connection conn = null;
    String tableName;
    try {
        String username = "root";
        String password ="@Raja123";
        String url = "jdbc:mysql://localhost:3306/mydb"; // Adjust the database name as needed
        Class.forName("com.mysql.cj.jdbc.Driver");
        conn = DriverManager.getConnection(url, username, password);
        if (conn != null) {
            System.out.println("Connected to the database successfully!");
        } else {
            System.out.println("Failed to make connection!");
        }
        Statement stmt = null;
        ResultSet rs = null;
        try {
            stmt = conn.createStatement();
            rs = stmt.executeQuery("show tables");
            while(rs.next()) {
                tableName = rs.getString(1); // Use column index 1 for table name
                System.out.println("Table: " + tableName);
            }
            rs.close(); // Close the first ResultSet

            stmt.executeUpdate("create table if not exists Java_Course (id int, name varchar(255), duration int)");
            
            rs = stmt.executeQuery("show tables");
            while(rs.next()) {
                tableName = rs.getString(1); // Use column index 1 for table name
                System.out.println("Table: " + tableName);
            }
        } finally {
            if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException e) {
                    System.out.println("Failed to close ResultSet: " + e.getMessage());
                }
            }
            if (stmt != null) {
                try {
                    stmt.close();
                } catch (SQLException e) {
                    System.out.println("Failed to close Statement: " + e.getMessage());
                }
            }
        }
    }catch (SQLException e) {
        System.out.println("SQL Exception: " + e.getMessage());
    } catch (ClassNotFoundException e) {
        System.out.println("Class Not Found Exception: " + e.getMessage());
    } finally {
        if (conn != null) {
            try {
                conn.close();
                System.out.println("Connection closed.");
            } catch (SQLException e) {
                System.out.println("Failed to close connection: " + e.getMessage());
            }
        }
    } 
}
}
