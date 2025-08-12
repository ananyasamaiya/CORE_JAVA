// accesing B but their is no B class in B.java
class A{
    public static void main(String[] args)
    {
        B x;
    }
}

// A.java:5: error: cannot access B
//         B x;
//         ^
//   bad source file: .\B.java
//     file does not contain class B
//     Please remove or make sure it appears in the correct subdirectory of the sourcepath.
// 1 error