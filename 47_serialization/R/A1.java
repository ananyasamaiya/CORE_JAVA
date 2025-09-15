import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.IOException;

class A1{
    public static void main(String[] args) throws IOException{
       
        Student student = new Student();
        student.name = "sugyan";
        student.age = 19;

        new ObjectOutputStream(new FileOutputStream("bheem.txt")).writeObject(student);
    }
}
