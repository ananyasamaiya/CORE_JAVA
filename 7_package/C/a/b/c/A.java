//only make B visible not accessable
package a.b.c;
import x.y.B;
class A{
    B x;
}

// a\b\c\A.java:3: error: B is not public in x.y; cannot be accessed from outside package
// import x.y.B;
//           ^
// a\b\c\A.java:5: error: B is not public in x.y; cannot be accessed from outside package
//     B x;
//     ^
// 2 errors
