// making static

class D{
    static int y = 99;
    public static void main(String[] args)
    {
        System.out.println(y); //99
        System.out.println(D.y);  //99
        System.out.println(B4.y); //999
    }
}
class B4{
    static int y = 999;
}
