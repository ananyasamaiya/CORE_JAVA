import java.io.FileNotFoundException;
import java.io.EOFException;
class CC1{
    void pro() throws EOFException, FileNotFoundException{

    }
}

class G extends CC1 {
    //ok: throws same exception
    void pro() throws EOFException, FileNotFoundException{

    }
} 