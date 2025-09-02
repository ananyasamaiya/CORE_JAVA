
import java.util.ArrayList;
import java.util.Iterator;

class L{
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
            System.out.println(y.next());
        }

    }
}
