import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

class C {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/prac?user=root&password=1234");

            String query = "insert into students (name,email,password,phone,marks) value (?,?,?,?,?)";

            PreparedStatement ps = con.prepareStatement(query);

            ps.setString(1, args[0]);
            ps.setString(2, args[1]);
            ps.setString(3, args[2]);
            ps.setString(4, args[3]);
            ps.setFloat(5, Float.parseFloat(args[4]));

            int rowsCount = ps.executeUpdate();
            System.out.println(rowsCount);

            con.close();
        } catch(SQLException|ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}