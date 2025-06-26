class H{
    public static void main(String[] args)
    {
        H a = new H();

        a.pro();
    }
}
    class C1{
        void pro()
        {
         System.out.println("Hello");
        }
    }


// H.java:6: error: cannot find symbol
//         a.pro();
//          ^
//   symbol:   method pro()
//   location: variable a of type H
// 1 error