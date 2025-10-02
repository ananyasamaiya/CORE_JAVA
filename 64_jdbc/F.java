import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

class F{
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/prac?user=root&password=1234");

            String query = "select * from students";

            PreparedStatement ps = con.prepareStatement(query);

            ResultSet rs = ps.executeQuery();

            while(rs.next()) {
                System.out.print(rs.getInt("student_id") + "\t");
                System.out.print(rs.getString("name") + "\t");
                System.out.print(rs.getString("email") + "\t");
                System.out.print(rs.getString("password") + "\t");
                System.out.print(rs.getString("phone") + "\t");
                System.out.println(rs.getFloat("marks"));
            }

            con.close();
        } catch(SQLException|ClassNotFoundException e) {
            e.printStackTrace();
        }
    }    
}