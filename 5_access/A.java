class A{
    public static void main(String[] args)
    {
        System.out.println(y);
    }
}
class B1{
    int y = 999;
}

// A.java:4: error: cannot find symbol
//         System.out.println(y);
//                            ^
//   symbol:   variable y
//   location: class A
// 1 error