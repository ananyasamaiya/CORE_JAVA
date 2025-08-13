//By making copy of y and give it to w
class A{
    private int y=34;
    int pro()
    {
        return y;
    }
}
class E3{
    public static void main(String[] args)
    {
        A x = new A();
        int w = x.pro();

        System.out.println(w); //34
    }
}