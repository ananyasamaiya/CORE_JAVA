package x.y;

//import a.b.B;
// import a.b.c.C;

import a.b.*;


class A {
    public static void main(String[] args)
    {
        B x;

        D y;

        C q;  //Error
    }
}

// x\y\A.java:16: error: cannot find symbol
//         C q;
//         ^
//   symbol:   class C
//   location: class A
// 1 error