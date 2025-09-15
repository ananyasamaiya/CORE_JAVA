import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

class C{
    public static void main(String[] args) throws IOException{
        File file = new File("kaju.txt");

        FileWriter fw = new FileWriter(file);
        // hint:  kaju.txt does not exist

        fw.write('A');
        fw.write(66);

        // fw.flush();
        // fw.close();
    }
}