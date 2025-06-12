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
// 1 error