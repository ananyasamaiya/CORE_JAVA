import java.io.PrintWriter;
import java.io.FileNotFoundException;

class H{
    public static void main(String[] args) throws FileNotFoundException{
        PrintWriter pw = new PrintWriter("jay.txt");

        pw.close();
    }
}