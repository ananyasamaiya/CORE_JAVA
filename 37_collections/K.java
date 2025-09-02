
import java.util.ArrayList;
import java.util.Iterator;

class K{
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

        System.out.println("Iterator Subclass : " + y);  //java.util.ArrayList$Itr@f6f4d33

    }
}
