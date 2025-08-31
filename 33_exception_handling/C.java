import java.io.FileReader;
import java.io.FileNotFoundException;

class YY3{
    YY3() throws FileNotFoundException{
        FileReader fr = new FileReader("abc.txt");
    }
}

class C extends YY3{
    C() throws FileNotFoundException{
        super();
    }

    public static void main(String[] args) throws FileNotFoundException{
        System.out.println("A");

        C a = new C();
        System.out.println("B");
    }
}
