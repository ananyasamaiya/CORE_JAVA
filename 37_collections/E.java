// Duplicate records are allowed
//here we are write primitive value where we need to write Object reference variable/code
//this give error before Java 5 so we need to write (new Integer(45);)
//After Java 5 this can be done by autoboxing then conversion


import java.util.ArrayList;


class E {
    public static void main(String[] args) {
        ArrayList x = new ArrayList();
        
        x.add(45);
        x.add(23);
        x.add(13);
        x.add(67);
        x.add(23);
        x.add(89);
        x.add(12);
        x.add(23);

        System.out.println(x);  //[45, 23, 13, 67, 23, 89, 12, 23]
    }
}

// compiler warning
// Note: E.java uses unchecked or unsafe operations.
// Note: Recompile with -Xlint:unchecked for details.