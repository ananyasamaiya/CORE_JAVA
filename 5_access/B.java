class B{
    int y = 99;
    public static void main(String[] args)
    {
        System.out.println(y);
    }
}
class B2{
    int y = 999;
}


// B.java:5: error: non-static variable y cannot be referenced from a static context
//         System.out.println(y);
//                            ^
// 1 error
