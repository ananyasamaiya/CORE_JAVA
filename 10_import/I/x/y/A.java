// Whose path is short / simple do not import it use it directly with full name
package x.y;

import a.b.c.B;
//import a.b.B;

class A{
    public static void main(String[] args)
    {
        B w = new B();
        a.b.B q = new a.b.B();

        //a.b.B q = new B();  WRONG

    }
}
