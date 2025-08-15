// after compiling X.java,B.class will be produced
// but it will not be class as it is not public

package a.b.c;
import x.y.B;

class A{
    public static void main(String[] args)
    {
        B a;

    }
}

// a\b\c\A.java:5: error: B is not public in x.y; cannot be accessed from outside package
// import x.y.B;
//           ^
// a\b\c\A.java:10: error: B is not public in x.y; cannot be accessed from outside package
//         B a;
//         ^
// 2 errors