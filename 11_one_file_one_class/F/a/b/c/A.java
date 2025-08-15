// here we have B.java it will see that class B is not public so we cant access 
// B.class will not be made
package a.b.c;
import x.y.B;

class A{
    public static void main(String[] args)
    {
        B a = new B();
        System.out.println(a.y);

    }
}

// When we compiled A.java
// Both B.class and A.class is made
// we delete A.class
// we change value of y to 22 in B.java
// now we have y = 5 stored in B.class and y = 22 in b.java

// when we recomplied A.java 
// it will override B.class and stored y = 22 in it 
// so the output will be 22

