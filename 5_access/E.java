class E{
     int y = 99;
    public static void main(String[] args)
    {
        A1 a = new A1();
        System.out.println(a.y); //999

        E b = new E();
        System.out.println(b.y);  //99
    }
}
class A1{
     int y = 999;
}