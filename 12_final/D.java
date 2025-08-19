class X4{
    final void pro(){
        System.out.println("Hello");
    }
}

class D extends X4{
    public static void main(String[] args)
    {
        D x = new D();

        x.pro();   //access through inheritance
    }
}