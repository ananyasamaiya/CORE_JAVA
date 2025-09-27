import java.io.Serializable;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
class B4 implements Serializable{
    private static B4 x;

    private B4(){

    }

    //Lazy Initialization
    public static B4 getInstance(){
        if(x==null)
            x=new B4();
        
        return x;
    }
}

class K{
    public static void main(String[] args) throws IOException,ClassNotFoundException{
        B4 x = B4.getInstance();

        new ObjectOutputStream(new FileOutputStream("golu.txt")).writeObject(x);

        B4 y = (B4)(new ObjectInputStream(new FileInputStream("golu.txt"))).readObject();

        System.out.println(x);
        System.out.println(y);
        System.out.println(x==y);
    }
}