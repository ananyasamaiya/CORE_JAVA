class I{
    public static void main(String[] args)
    {
        C2 a = new C2();

        a.pro();   // Access thriugh instantiation  Hello
    }
}
    class C2{
        void pro()
        {
         System.out.println("Hello");
        }
    }