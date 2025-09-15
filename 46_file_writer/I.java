import java.io.PrintWriter;
import java.io.FileNotFoundException;

class I{
    public static void main(String[] args) throws FileNotFoundException{
        PrintWriter pw = new PrintWriter("jay.txt");

        pw.print(true);
        pw.print(12);
        pw.print(46.35);
        pw.print("Amit");

        pw.close();
    }
}