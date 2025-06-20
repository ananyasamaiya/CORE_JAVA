<<<<<<< HEAD
//Changing static member value using multiple object

class P{
    static int y = 45;

    public static void main(String[] args)
    {
        P a = new P();
        a.y = 99;

        P b = new P();
        b.y = 999;

        P c = new P();
        c.y = 9999;

       b.pro(); //9999
       a.pro(); //9999
       c.pro(); //9999
    }
    void pro()
    {
        System.out.println(y);
    }
}
=======
//Changing static member value using multiple object

class P{
    static int y = 45;

    public static void main(String[] args)
    {
        P a = new P();
        a.y = 99;

        P b = new P();
        b.y = 999;

        P c = new P();
        c.y = 9999;

       b.pro(); //9999
       a.pro(); //9999
       c.pro(); //9999
    }
    void pro()
    {
        System.out.println(y);
    }
}
>>>>>>> 0577215d02043d72dfc9f3b7d836e8da7fb466d6
