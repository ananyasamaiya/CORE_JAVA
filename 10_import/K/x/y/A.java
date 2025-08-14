//Instead of writingimport for all the files of same package multiple time
//We can use wildcard character (*)
package x.y;

//import a.b.c.B;
// import a.b.c.C;
// import a.b.c.D;

import a.b.c.*;

class A{
    public static void main(String[] args)
    {
        B a;

        C b;

        D c; 
    }
}