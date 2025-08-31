//we can catch checked exception 
// only if in try block there is code which generate that error
//compile will give error

import java.io.FileReader;
import java.io.FileNotFoundException;


class H1{
    public static void main(String[] args){
        System.out.println("A");

        try{
           // FileReader a = new FileReader("golu.txt");
        } catch(FileNotFoundException e){
            System.out.println(e + " ~~~~~~~~~");
        }
        
        System.out.println("B");
    }
}

// H1.java:15: error: exception FileNotFoundException is never thrown in body of corresponding try statement
//         } catch(FileNotFoundException e){
//           ^
// 1 error