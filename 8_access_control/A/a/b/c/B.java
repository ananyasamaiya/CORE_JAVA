package a.b.c;

class B{

public static void main(String[] args)
{
    A a = new A();
    a.pro(); // ERROR
}
}
// a\b\c\B.java:8: error: pro() has private access in A
//     a.pro();
//      ^
// 1 error