import java.io.Serializable;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
class C3 implements Serializable{

}
class C2 extends C3{
    private static C2 x;

    private C2(){

    }

    protected Object readResolve(){
        return x;
    }

    //Lazy Initialization
    public static C2 getInstance(){
        if(x==null)
            x=new C2();
        
        return x;
    }
}

class L{
    public static void main(String[] args) throws IOException,ClassNotFoundException{
        C2 x = C2.getInstance();

        new ObjectOutputStream(new FileOutputStream("golu.txt")).writeObject(x);

        C2 y = (C2)(new ObjectInputStream(new FileInputStream("golu.txt"))).readObject();

        System.out.println(x);
        System.out.println(y);
        System.out.println(x==y);
    }
}