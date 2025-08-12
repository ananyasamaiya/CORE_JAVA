//accessing variable inside B which is not public
package a.b.c;
import x.y.B;
class A{
    public static void main(String[] args)
    {
        B x = new B();
        System.out.println(x.y);
    }
}

// a\b\c\A.java:8: error: y is not public in B; cannot be accessed from outside package
//         System.out.println(x.y);
//                             ^
// 1 error