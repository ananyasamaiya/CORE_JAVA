import java.io.FileWriter;
import java.io.IOException;

class F{
    public static void main(String[] args) throws IOException{
        FileWriter fw = new FileWriter("ritesh.txt");

        fw.write("Mohan is my best friend ");
        fw.write("he is a good boy ");
        fw.write("he is a singer");

        fw.close();
    }
}