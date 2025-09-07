import java.io.File;
import java.io.FileReader;
import java.io.IOException;

class D{
    public static void main(String[] args) throws IOException{
        File file = new File("golu.txt");
        // write a sentence in golu.txt
        FileReader fr = new FileReader(file);

        int val;
        while((val = fr.read()) != -1){
            System.out.print((char)val);
        }

        fr.close();
    }
}