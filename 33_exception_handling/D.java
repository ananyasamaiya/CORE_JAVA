//call to super must be first statement in constructor 
// try is also a statement

import java.io.FileReader;
import java.io.FileNotFoundException;

class YY4{
    YY4() throws FileNotFoundException{
        FileReader fr = new FileReader("abc.txt");
    }
}

class D extends YY4{
    D(){
        try{
        super();
        } catch(FileNotFoundException e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args){
        System.out.println("A");

        D a = new D();
        System.out.println("B");
    }
}

// D.java:13: error: call to super must be first statement in constructor
//         super();
//              ^
// 1 error

