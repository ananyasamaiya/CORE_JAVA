import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.IOException;

class B{
    public static void main(String[] args) throws IOException,ClassNotFoundException{
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("bheem.txt"));

        Student x = (Student) (ois.readObject());
        Student y = (Student) (ois.readObject());
        Student z = (Student) (ois.readObject());

        System.out.println(x);
        System.out.println(y);
        System.out.println(z);

        ois.close();
    }
}