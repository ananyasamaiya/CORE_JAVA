// Way 1 - same only different in we print remove value
//to remove all occurrence
//boolean remove(Object o) - Removes the first occurrence of the specified element from this list, if it is present.

import java.util.ArrayList;

class I2 {
    public static void main(String[] args) {
        ArrayList x = new ArrayList();
        
        x.add("vidit");
        x.add("mohan");
        x.add("dinesh");
        x.add("vidit");
        x.add("sarvesh");
        x.add("prayag");
        x.add("vidit");
        
        System.out.println(x);
        
        String y = new String("vidit");
        System.out.println(x.remove(y));
        System.out.println(x);
        System.out.println(x.remove(y));
        System.out.println(x);
        System.out.println(x.remove(y));        
        System.out.println(x);
        System.out.println(x.remove(y));        
    }
}