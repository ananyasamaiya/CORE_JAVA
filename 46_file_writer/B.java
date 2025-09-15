import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

class B{
    public static void main(String[] args) throws IOException{
        File file = new File("indra.txt");

        FileWriter fw = new FileWriter(file);
        // hint: indra.txt does not exist

        fw.close();
    }
}