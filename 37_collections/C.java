// Using method of Collection 
// add(E e)  or add(Object)

import java.util.ArrayList;

class C{
    public static void main(String[] args){
        ArrayList x = new ArrayList();

        System.out.println(x.isEmpty());  //true 
        System.out.println(x.size());  //0

        x.add(12);
        x.add(78);
        x.add(45);
        x.add(35);
        x.add(9);
        x.add(99);

        System.out.println("~~~~~~~~~~~~~~~~~~~~~");

        System.out.println(x);  //[12, 78, 45, 35, 9, 99]
        System.out.println(x.isEmpty());  //false
        System.out.println(x.size());  //6
    }
}

// while compiling - warning
// Note: C.java uses unchecked or unsafe operations.
// Note: Recompile with -Xlint:unchecked for details.