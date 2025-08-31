import java.io.FileNotFoundException;
import java.io.EOFException;
class DD1{
    void pro() throws EOFException, FileNotFoundException{

    }
}

class H extends DD1 {
    //ok: throws fewer exception
    void pro() throws FileNotFoundException{

    }
} 