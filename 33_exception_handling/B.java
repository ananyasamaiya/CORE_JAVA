import java.io.FileReader;
import java.io.FileNotFoundException;

class YY2{
    YY2() throws FileNotFoundException{
        FileReader fr = new FileReader("abc.txt");
    }
}

class B extends YY2{
    B() throws FileNotFoundException{
        super();
    }

    public static void main(String[] args){
        System.out.println("A");

        B a = new B();
        System.out.println("B");
    }
}

// B.java:18: error: unreported exception FileNotFoundException; must be caught or declared to be thrown
//         B a = new B();
//                ^
// 1 error