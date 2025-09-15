import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.IOException;

class B{
    public static void main(String[] args) throws IOException,ClassNotFoundException{
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("bheem.txt"));

        Employee x = (Employee) (ois.readObject());
        Student y = (Student) (ois.readObject());
        
        System.out.println(x);
        System.out.println(y);

        ois.close();
    }
}

// Exception in thread "main" java.lang.ClassCastException: class Student cannot be cast to class Employee (Student and Employee are in unnamed module of loader 'app')
//         at B.main(B.java:9)