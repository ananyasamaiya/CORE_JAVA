//it remove only the first occurrence
//boolean remove(Object o) - Removes the first occurrence of the specified element from this list, if it is present.

import java.util.ArrayList;

class I{
    public static void main(String[] args){
        ArrayList x = new ArrayList();

        x.add("mohan");
        x.add("dinesh");
        x.add("vidit");
        x.add("sarvesh");
        x.add("paryag");
        x.add("vidit");
        x.add("sarvesh");

        System.out.println(x); //[mohan, dinesh, vidit, sarvesh, paryag, vidit, sarvesh]

        String y = new String("vidit");
        x.remove(y);

        System.out.println(x);  //[mohan, dinesh, sarvesh, paryag, vidit, sarvesh]
        
    }
}