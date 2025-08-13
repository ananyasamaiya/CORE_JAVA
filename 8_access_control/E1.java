//can't access private member but can access other member
class A{
    private int y=99;
    void pro()
    {
        System.out.println("Hello");
    }
}
class E1{
    public static void main(String[] args)
    {
        A x = new A();
        //System.out.println(x.y);  //Error
        x.pro();  //Hello
    }
}