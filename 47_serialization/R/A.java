import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.IOException;

class A{
    public static void main(String[] args) throws IOException{
       
        Student student = new Student();
        student.name = "vigyan";
        student.age = 12;

        new ObjectOutputStream(new FileOutputStream("bheem.txt")).writeObject(student);
    }
}
