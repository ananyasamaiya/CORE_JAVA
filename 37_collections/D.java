// Using method of Collection 
// add(E e)  or add(Object)

import java.util.ArrayList;

class D{
    public static void main(String[] args){
        ArrayList x = new ArrayList();

        System.out.println(x); //[]

        x.add("mohan");
        x.add("dinesh");
        x.add("vidit");
        x.add("sarvesh");
        x.add("paryag");

        System.out.println(x); //[mohan, dinesh, vidit, sarvesh, paryag]
    }
}

//compiler warning
//Note: D.java uses unchecked or unsafe operations.
// Note: Recompile with -Xlint:unchecked for details.