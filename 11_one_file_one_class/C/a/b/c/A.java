//when X.java is not compiled so no B.class is created

package a.b.c;
import x.y.B;

class A{
    public static void main(String[] args)
    {
        B a;

    }
}


// a\b\c\A.java:4: error: cannot find symbol
// import x.y.B;
//           ^
//   symbol:   class B
//   location: package x.y
// a\b\c\A.java:9: error: cannot find symbol
//         B a;
//         ^
//   symbol:   class B
//   location: class A
// 2 errors