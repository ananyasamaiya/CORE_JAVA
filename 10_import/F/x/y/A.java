//There can be same name file BUT in different location only
package x.y;

import a.b.c.B;
import a.b.B;

class A{
    public static void main(String[] args)
    {

    }
}

// x\y\A.java:4: error: a type with the same simple name is already defined by the single-type-import of B
// import a.b.B;
// ^
// 1 error