//boolean remove(Object o)
//Removes the first occurrence of the specified element from this list, if it is present.

import java.util.ArrayList;

class H{
    public static void main(String[] args){
        ArrayList x = new ArrayList();

        x.add("mohan");
        x.add("dinesh");
        x.add("vidit");
        x.add("sarvesh");
        x.add("paryag");

        System.out.println(x); //[mohan, dinesh, vidit, sarvesh, paryag]

        String y = new String("vidit");
        x.remove(y);

        System.out.println(x);  //[mohan, dinesh, sarvesh, paryag]
        
    }
}