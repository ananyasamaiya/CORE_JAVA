import java.io.FileWriter; 
import java.io.BufferedWriter; 
import java.io.IOException;

class G{
    public static void main(String[] args) throws IOException{
        FileWriter fw = new FileWriter("himesh.txt");

        BufferedWriter bw = new BufferedWriter(fw);

        bw.write("Mohan is my best friend");
        bw.newLine();
        bw.write("he is a good boy");
        bw.newLine();
        bw.write("he is a singer");

        bw.close();
    }
}