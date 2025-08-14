// can access protected member at same package level or by making kids ( inheritance)
// But by only making object of child we can access it
//Can't access by using object of parent
package x.y;
import a.b.c.A;

class B extends A{
    public static void main(String[] args)
    {
       // B a = new B();
       //System.out.println(a.w); //9
       A b = new A();
       System.out.println(b.w);
     }
}

// x\y\B.java:13: error: w has protected access in A
//        System.out.println(b.w);
//                            ^
// 1 error