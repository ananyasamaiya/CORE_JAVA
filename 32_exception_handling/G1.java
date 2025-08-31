//for checked exception compiler do check if we have handle or declare it else give error
import java.io.FileReader;
import java.io.FileNotFoundException;

//declared

class G1{
    public static void main(String[] args) throws FileNotFoundException{
        System.out.println("A");

        FileReader a = new FileReader("golu.txt");
        
        System.out.println("B");
    }
}

// if founded 
// A
// B


// if Not found
// A
// Exception in thread "main" java.io.FileNotFoundException: golu.txt (The system cannot find the file specified)
//         at java.base/java.io.FileInputStream.open0(Native Method)
//         at java.base/java.io.FileInputStream.open(FileInputStream.java:216)
//         at java.base/java.io.FileInputStream.<init>(FileInputStream.java:157)
//         at java.base/java.io.FileInputStream.<init>(FileInputStream.java:111)
//         at java.base/java.io.FileReader.<init>(FileReader.java:60)
//         at G1.main(G1.java:11)



