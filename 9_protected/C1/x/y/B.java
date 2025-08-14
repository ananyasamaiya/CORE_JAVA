// can access protected member at same package level or by making kids ( inheritance)
// But by only making object of child we can access it
//Can't access by using object of parent
package x.y;
import a.b.c.A;

public class B extends A{
    
}


// a\b\D.java:9: error: cannot find symbol
//         System.out.println(a.x);
//                            ^
//   symbol:   variable a
//   location: class D
// 1 error