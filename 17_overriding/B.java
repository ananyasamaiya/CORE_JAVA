class X2{
    void pro(){
        System.out.println("pro()");
    }
}

class B extends X2{
    //overloaded methods in class B: pro() (inherited)
    //and pro(int) (self)

    void pro(int y)
    {
        System.out.println("pro(int)");
    }

    public static void main(String[] args){
        B a = new B();

        a.pro();
        a.pro(2);
    }
}

