// here we have B.java it will see that class B is not public so we cant access 
// B.class will not be made
package a.b.c;
import x.y.B;

class A{
    public static void main(String[] args)
    {
        B a;

    }
}


// a\b\c\A.java:4: error: B is not public in x.y; cannot be accessed from outside package
// import x.y.B;
//           ^
// a\b\c\A.java:9: error: B is not public in x.y; cannot be accessed from outside package
//         B a;
//         ^
// 2 errors

