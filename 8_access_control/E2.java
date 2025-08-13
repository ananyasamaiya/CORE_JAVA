//can access private variable using method in A
class A{
    private int y=99;
    void pro()
    {
        System.out.println(y);
    }
}
class E2{
    public static void main(String[] args)
    {
        A x = new A();
        //System.out.println(x.y);  //Error
        x.pro();  //99
    }
}