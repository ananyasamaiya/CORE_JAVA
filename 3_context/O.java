<<<<<<< HEAD
//Multiply object are made , instance member is access 
class O{
    int y = 45;

    public static void main(String[] args)
    {
        O a = new O();
        a.y = 99;

        O b = new O();
        b.y = 999;

        O c = new O();
        c.y = 9999;

        b.pro(); //999
        c.pro(); //9999
        a.pro(); //99
    }
    void pro()
    {
        System.out.println(y);
    }
=======
//Multiply object are made , instance member is access 
class O{
    int y = 45;

    public static void main(String[] args)
    {
        O a = new O();
        a.y = 99;

        O b = new O();
        b.y = 999;

        O c = new O();
        c.y = 9999;

        b.pro(); //999
        c.pro(); //9999
        a.pro(); //99
    }
    void pro()
    {
        System.out.println(y);
    }
>>>>>>> 0577215d02043d72dfc9f3b7d836e8da7fb466d6
}