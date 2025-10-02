import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

class I {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/prac?user=root&password=1234");

            String query = "delete from students where student_id=?";

            PreparedStatement ps = con.prepareStatement(query);
          
            System.out.print("Enter student id: ");
            ps.setInt(1, new Scanner(System.in).nextInt());

            ps.executeUpdate();
            
            con.close();
        } catch(SQLException|ClassNotFoundException e) {
            e.printStackTrace();
        }
    }    
}