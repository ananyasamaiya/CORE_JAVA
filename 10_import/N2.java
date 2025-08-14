//Only for STATIC member 
// we can import static variable or member 

import static java.lang.Math.PI;

class N2{
    public static void main(String[] args)
    {
        System.out.println(PI);
        System.out.println(E);
        System.out.println(max(54,86));

    }
}

// N2.java:10: error: cannot find symbol
//         System.out.println(E);
//                            ^
//   symbol:   variable E
//   location: class N2
// N2.java:11: error: cannot find symbol
//         System.out.println(max(54,86));
//                            ^
//   symbol:   method max(int,int)
//   location: class N2
// 2 errors
