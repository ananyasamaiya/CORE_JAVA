import java.io.IOException;
class BB1{
    void pro() throws IOException{

    }
}

class F extends BB1{
    //ok: throws fewer exception
    void pro() {

    }
} 