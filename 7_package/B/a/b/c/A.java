//Only package declartion and call B class
package a.b.c;

class A{
    public static void main(String[] args)
    {
        B x; //ERROR
    }
}

//Must compile while sitting in Root folder 
//and giving path of file

//Compile
//..../B>javac a/b/c/A.java

//Run
// ..../B>java a/b/c/A


// a\b\c\A.java:7: error: cannot find symbol
//         B x; //ERROR
//         ^
//   symbol:   class B
//   location: class A
// 1 error