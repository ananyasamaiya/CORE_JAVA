import java.io.PrintWriter;
import java.io.FileNotFoundException;

class J {
    public static void main(String[] args) throws FileNotFoundException {
        PrintWriter pw = new PrintWriter("vijay.txt");

        pw.println(false);
        pw.println(78);
        pw.println(3.97);
        pw.println("Sumit");

        pw.close();
    }
}