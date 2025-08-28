class C{
    public static void main(String[] args){
        int m = 3;

        byte x = m;
        short y = m;
        char z = m;

        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
    }
}

// F:\Java\examples\29_wrapper_classes\conversion_casting>javac C.java
// C.java:5: error: incompatible types: possible lossy conversion from int to byte
//         byte x = m;
//                  ^
// C.java:6: error: incompatible types: possible lossy conversion from int to short
//         short y = m;
//                   ^
// C.java:7: error: incompatible types: possible lossy conversion from int to char
//         char z = m;
//                  ^
// 3 errors
