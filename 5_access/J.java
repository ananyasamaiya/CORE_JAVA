class J extends C3{
    public static void main(String[] arJs)
    {
        J x = new J();

        x.info();  // access through inheritance
        //Hello
    }
    
}
class C3{
        void info()
        {
            System.out.println("Hello");
        }
    }