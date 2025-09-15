import java.io.FileWriter;
import java.io.IOException;

class E{
    public static void main (String[] args){
        String str = "Some text to demonstrate the concept";
        try{
            FileWriter fw = new FileWriter("rahul.txt");

            char[] arr = new char[4];
            int j = 0;
            while(j<str.length()){
                int i=0;
                for(i=0;i<arr.length;i++){
                    arr[i] = str.charAt(j++);
                    if(j == str.length()) break;
                }
                if(i == arr.length)
                    fw.write(arr);
                else{
                    for(int k=0; k<=i;k++)
                        fw.write(arr[k]);
                }
            }

            fw.close();
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}