import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

class D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Email: ");
        String email = sc.nextLine();
        
        System.out.print("Enter Password: ");
        String password = sc.nextLine();
        
        System.out.print("Enter Phone: ");
        String phone = sc.nextLine();
        
        System.out.print("Enter Marks: ");
        float marks = sc.nextFloat();

        sc.close();
        System.out.println();

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/prac?user=root&password=1234");

            String query = "insert into students (name,email,password,phone,marks) value (?,?,?,?,?)";

            PreparedStatement ps = con.prepareStatement(query);

            ps.setString(1, name);
            ps.setString(2, email);
            ps.setString(3, password);
            ps.setString(4, phone);
            ps.setFloat(5, marks);
            
            int rowsCount = ps.executeUpdate();
            System.out.println(rowsCount);

            con.close();
        } catch(SQLException|ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}