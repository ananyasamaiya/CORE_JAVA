package a;

import x.B;

class A{
    public static void main(String[] args){
        new B();
    }
}

// a\A.java:7: error: B() is not public in B; cannot be accessed from outside package
//         new B();
//         ^
// 1 error