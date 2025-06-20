<<<<<<< HEAD
//local variable out of scope
class M{
    float e=5.5f;
    public static void main(String[] args)
    {
        M x = new M();
        x.pro();
    }
    void pro(){
        System.out.println(x.e);
    }

}


// M.java:10: error: cannot find symbol
//         System.out.println(x.e);
//                            ^
//   symbol:   variable x
//   location: class M
=======
//local variable out of scope
class M{
    float e=5.5f;
    public static void main(String[] args)
    {
        M x = new M();
        x.pro();
    }
    void pro(){
        System.out.println(x.e);
    }

}


// M.java:10: error: cannot find symbol
//         System.out.println(x.e);
//                            ^
//   symbol:   variable x
//   location: class M
>>>>>>> 0577215d02043d72dfc9f3b7d836e8da7fb466d6
// 1 error