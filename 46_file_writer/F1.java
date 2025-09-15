import java.io.FileWriter;
import java.io.IOException;

class F1{
    public static void main(String[] args) throws IOException{
        FileWriter fw = new FileWriter("vijay.txt");

        fw.write("Mohan is my best friend\n");
        fw.write("he is a good boy\n");
        fw.write("he is a singer\n");

        fw.close();
    }
}