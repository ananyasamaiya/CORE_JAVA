//Way 1
//to remove all occurrence
//boolean remove(Object o) - Removes the first occurrence of the specified element from this list, if it is present.

import java.util.ArrayList;

class I1{
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

        System.out.println(x); //[vidit, mohan, dinesh, vidit, sarvesh, paryag, vidit, sarvesh]

        String y = new String("vidit");
        x.remove(y);
        System.out.println(x);  
        x.remove(y);
        System.out.println(x);  
        x.remove(y);
        System.out.println(x);  
        
    }
}