import java.io.FileNotFoundException;
import java.io.EOFException;
import java.io.IOException;
class HH1{
    void pro() throws FileNotFoundException{

    }
}

class L extends HH1 {
    //ok: throws newer exception
    void pro() throws ClassNotFoundException{

    }
} 

// L.java:12: error: pro() in L cannot override pro() in HH1
//     void pro() throws ClassNotFoundException{
//          ^
//   overridden method does not throw ClassNotFoundException
// 1 error

