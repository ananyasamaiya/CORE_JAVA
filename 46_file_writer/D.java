import java.io.FileWriter;
import java.io.IOException;

class D{
    public static void main (String[] args){
        String str = "Some text to demonstrate the concept";
        try{
            FileWriter fw = new FileWriter("dholakpur.txt");

            for(int i=0;i<str.length(); i++){
                fw.write(str.charAt(i));
            }
            fw.close();
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}