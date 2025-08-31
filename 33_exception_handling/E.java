import java.io.IOException;

class AA1{
    void pro() throws IOException{

    } 
}

class E extends AA1{
    //ok : throws same exception
    void pro() throws IOException{

    }
}