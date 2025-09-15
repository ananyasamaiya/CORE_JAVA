import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.IOException;

class A{
    public static void main(String[] args) throws IOException{
        Student s1 = new Student();
        s1.name = "pragyan";
        s1.age = 15;
        s1.marks = 78.89f;

        Student s2 = new Student();
        s2.name = "vigyan";
        s2.age = 12;
        s2.marks = 95.11f;

        Student s3 = new Student();
        s3.name = "sugyan";
        s3.age = 17;
        s3.marks = 83.22f;

        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("bheem.txt"));

        oos.writeObject(s1);
        oos.writeObject(s2);
        oos.writeObject(s3);

        oos.close();
    }
}