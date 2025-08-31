import java.io.FileNotFoundException;
import java.io.EOFException;
import java.io.IOException;
class GG1{
    void pro() throws FileNotFoundException{

    }
}

class K extends GG1 {
    //ok: throws wider exception
    void pro() throws IOException{

    }
} 

// K.java:12: error: pro() in K cannot override pro() in GG1
//     void pro() throws IOException{
//          ^
//   overridden method does not throw IOException
// 1 error
