import java.io.FileNotFoundException;
import java.io.IOException;
class EE1{
    void pro() throws IOException{

    }
}

class I extends EE1 {
    //ok: throws narrower exception
    void pro() throws FileNotFoundException{

    }
} 