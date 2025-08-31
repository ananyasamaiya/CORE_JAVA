import java.io.FileNotFoundException;
import java.io.EOFException;
import java.io.IOException;
class FF1{
    void pro() throws IOException{

    }
}

class J extends FF1 {
    //ok: throws narrower exception
    void pro() throws FileNotFoundException, EOFException{

    }
} 