import java.io.FileNotFoundException;
import java.io.EOFException;
import java.io.IOException;
class II1{
    void pro() throws FileNotFoundException{

    }
}

class M extends II1 {
    //ok: throws fewer exception.. hint: ClassCastException is an Unchecked Exception
    void pro() throws ClassCastException{

    }
} 
