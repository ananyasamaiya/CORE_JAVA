class B{
    public static void main(String[] args){
        byte x = 128;
        short y = 56000;
        char z =78000;

        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
    }
}

// B.java:3: error: incompatible types: possible lossy conversion from int to byte
//         byte x = 128;
//                  ^
// B.java:4: error: incompatible types: possible lossy conversion from int to short
//         short y = 56000;
//                   ^
// B.java:5: error: incompatible types: possible lossy conversion from int to char
//         char z =78000;
//                 ^
// 3 errors