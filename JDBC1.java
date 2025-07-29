import java.sql.*;
import java.util.*;
public class JDBC1 {
    public static void main(String[] args) {
        Connection conn=null;
        PreparedStatement pstmt=null;
        Statement stmt=null;
        ResultSet rs=null;
        String id,name,duration;
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
            System.out.println("\n\n -------Result before Insert -------\n\n");
            stmt = conn.createStatement();
            stmt.execute("Select * from Java_Course");
            rs = stmt.getResultSet();
            while(rs.next()) {
                id = rs.getString(1); // Use index for column
                name = rs.getString(2);
                duration = rs.getString(3);
                System.out.println("ID: " + id + ", Name: " + name + ", Duration: " + duration);
            }
            System.out.println("\n\n ------- Input for the entries of Table -------\n\n");
            Scanner sc = new Scanner(System.in);
            int choice;
            do {
                System.out.print("Enter ID: ");
                id = sc.nextLine();
                System.out.print("Enter Name: ");
                name = sc.nextLine();
                System.out.print("Enter Duration: ");
                duration = sc.nextLine();
                String query = "insert into Java_Course values(?,?,?)";
                pstmt = conn.prepareStatement(query);
                pstmt.setString(1, id);
                pstmt.setString(2, name);
                pstmt.setString(3, duration);
                pstmt.executeUpdate();
                System.out.println("Do you want to insert another record? (1 for Yes, 0 for No): ");
                while (true) {
                    try {
                        choice = Integer.parseInt(sc.nextLine());
                        break;
                    } catch (NumberFormatException ex) {
                        System.out.println("Please enter 1 or 0:");
                    }
                }
            } while(choice == 1);
            System.out.println("\n\n -------Result after Insert -------\n\n");
            stmt.execute("Select * from Java_Course");
            rs = stmt.getResultSet();
            while(rs.next()) {
                id = rs.getString(1);
                name = rs.getString(2);
                duration = rs.getString(3);
                System.out.println("ID: " + id + ", Name: " + name + ", Duration: " + duration);
            }
            // Close resources
            if (rs != null) rs.close();
            if (stmt != null) stmt.close();
            if (pstmt != null) pstmt.close();
            if (conn != null) conn.close();
            sc.close();
        } catch(Exception e){
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
