import java.io.FileReader;
import java.io.FileNotFoundException;

class M3{
    public static void main(String[] args){
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

// M3.java:7: error: unreported exception FileNotFoundException; must be caught or declared to be thrown
//         aaa();
//            ^
// 1 error