import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

class G {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/prac?user=root&password=1234");

            String query = "update students set name='yam kumar' where student_id=?";
            
            PreparedStatement ps = con.prepareStatement(query);

            System.out.println("Enter student Id: ");
            int studentId = sc.nextInt();
            ps.setInt(1, studentId);

            int rowsCount = ps.executeUpdate();
            
            System.out.println(rowsCount);
            con.close();
        } catch(SQLException|ClassNotFoundException e) {
            e.printStackTrace();
        }
    }    
}