//method boolean contains(Object o)
//Returns true if this list contains the specified element.

import java.util.ArrayList;

class G{
    public static void main(String[] args){
        ArrayList x = new ArrayList();

        x.add("mohan");
        x.add("dinesh");
        x.add("vidit");
        x.add("sarvesh");
        x.add("paryag");

        System.out.println(x); //[mohan, dinesh, vidit, sarvesh, paryag]

        String y = new String("yamraj");
        // String y = new String("vidit");
        boolean flag = x.contains(y);

        System.out.println(flag);
    }
}
