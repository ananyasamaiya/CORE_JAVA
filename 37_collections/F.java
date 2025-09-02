//heterogeneous records are allowed

import java.util.ArrayList;

class F{
    public static void main(String[] args){
        ArrayList x = new ArrayList();

        x.add(45);
        x.add(23.76);
        x.add("om");
        x.add(true);
        x.add('A');

        System.out.println(x);  //[45, 23.76, om, true, A]
    }
}