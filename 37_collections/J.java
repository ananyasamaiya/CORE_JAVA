//Way 2
//to remove all occurrence
//boolean remove(Object o) - Removes the first occurrence of the specified element from this list, if it is present.

import java.util.ArrayList;

class J{
    public static void main(String[] args){
        ArrayList x = new ArrayList();

        x.add("vidit");
        x.add("mohan");
        x.add("dinesh");
        x.add("vidit");
        x.add("sarvesh");
        x.add("paryag");
        x.add("vidit");
        x.add("sarvesh");

        System.out.println(x);  //[vidit, mohan, dinesh, vidit, sarvesh, paryag, vidit, sarvesh]

        String y = new String("vidit");
       while( x.remove(y));
       
        System.out.println(x);   //[mohan, dinesh, sarvesh, paryag, sarvesh]
        
    }
}