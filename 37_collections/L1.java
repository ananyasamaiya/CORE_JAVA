// way 1 - to print element of arraylist
//using Iterator
import java.util.ArrayList;
import java.util.Iterator;

class L1{
    public static void main(String[] args){
        ArrayList x = new ArrayList();

        x.add("mohan");
        x.add("dinesh");
        x.add("vidit");
        x.add("sarvesh");
        x.add("paryag");

        System.out.println(x); 

        System.out.println("~~~~~~~~~~~~~~~~");

        Iterator y = x.iterator();

        while(y.hasNext()){
            System.out.println(y.next().length());
        }

    }
}

// L1.java:22: error: cannot find symbol
//             System.out.println(y.next().length());
//                                        ^
//   symbol:   method length()
//   location: class Object
