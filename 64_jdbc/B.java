import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

class B {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/prac?user=root&password=1234");

            String query = "insert into students (name,email,password,phone) value ('" + args[0] + "','" + args[1] + "','" + args[2] + "','" + args[3] + "')";

            PreparedStatement ps = con.prepareStatement(query);

            int rowsCount = ps.executeUpdate();
            System.out.println(rowsCount);

            con.close();
        } catch(SQLException|ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}