import java.io.FileReader;
import java.io.FileNotFoundException;

class YY1{
    YY1() throws FileNotFoundException{
        FileReader fr = new FileReader("abc.txt");
    }
}

class A extends YY1{
    A(){
        super();
    }

    public static void main(String[] args){
        System.out.println("A");

        A a = new A();
        System.out.println("B");
    }
}

// A.java:12: error: unreported exception FileNotFoundException; must be caught or declared to be thrown
//         super();
//              ^
// 1 error
