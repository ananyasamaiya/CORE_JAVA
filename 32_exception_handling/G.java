//for checked exception compiler do check if we have handle or declare it else give error
import java.io.FileReader;
import java.io.FileNotFoundException;

//handled

class G{
    public static void main(String[] args){
        System.out.println("A");

        try{
            FileReader a = new FileReader("golu.txt");
        } catch(FileNotFoundException e){
            System.out.println(e + " ~~~~~~~~~");
        }
        
        System.out.println("B");
    }
}

// if not FileNotFoundException
// A
// java.io.FileNotFoundException: golu.txt (The system cannot find the file specified) ~~~~~~~~~
// B

// if founded
// A
// B
