import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.IOException;

class A{
    public static void main(String[] args) throws IOException{
        Student s = new Student();
        s.name = "pragyan";
        s.age = 15;
        s.marks = 78.89f;

        Employee e = new Employee();
        e.name = "rajiv";
        e.rating = 9.9f;
        e.salary = 99000; 

        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("bheem.txt"));

        oos.writeObject(s);
        oos.writeObject(e);

        oos.close();
    }
}