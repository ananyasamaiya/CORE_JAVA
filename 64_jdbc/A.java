import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

class A{
    public static void main(String[] args){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/prac?user=root&password=1234");

            String query = "insert into students (name,email,password,phone) value ('Ananya Samaiya','ananya@gmail.com','123456',9876543287)";
            PreparedStatement ps = con.prepareStatement(query);

            int rowCount = ps.executeUpdate();

            System.out.println(rowCount);
        }catch(ClassNotFoundException e){
            e.printStackTrace();
        }catch(SQLException e){
            e.printStackTrace();
        }
    }
}
