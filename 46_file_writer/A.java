import java.io.FileWriter;
import java.io.IOException;

class A{
    public static void main(String[] args) throws IOException{
        FileWriter fw = new FileWriter("yamraj.txt");
        // hint: yamraj.txt does not exist

        fw.close();
    }
}