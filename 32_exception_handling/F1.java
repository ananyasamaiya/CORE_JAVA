//for checked exception compiler do check if we have handle or declare it else give error
import java.io.FileReader;

class F1{
    public static void main(String[] args){
        System.out.println("A");

        FileReader a = new FileReader("golu.txt");
        
        System.out.println("B");
    }
}

// F1.java:8: error: unreported exception FileNotFoundException; must be caught or declared to be thrown
//         FileReader a = new FileReader("golu.txt");
//                        ^
// 1 error

