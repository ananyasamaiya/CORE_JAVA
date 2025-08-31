import java.io.FileReader;
import java.io.FileNotFoundException;

class M4{
    public static void main(String[] args) throws FileNotFoundException{
        System.out.println("S");
        aaa();
        System.out.println("E");
    }

    static void aaa() throws FileNotFoundException{
        System.out.println("Q");
        bbb();
        System.out.println("K");
    }
    
    static void bbb() throws FileNotFoundException{
        System.out.println("J");
        ccc();
        System.out.println("D");
    }

    static void ccc() throws FileNotFoundException{
        System.out.println("Y");
        FileReader x = new FileReader("abc.txt");
        System.out.println("H");
    }
}
