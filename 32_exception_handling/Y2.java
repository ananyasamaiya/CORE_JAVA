import java.io.FileReader;
import java.io.FileNotFoundException;

class Y2{
    Y2() throws FileNotFoundException{
        System.out.println("A");
        FileReader fr = new FileReader("abc.txt");
        System.out.println("B");
    }

    public static void main(String[] args) throws FileNotFoundException{
        System.out.println("X");
        Y2 y = new Y2();
        System.out.println("Y2");
    }
}