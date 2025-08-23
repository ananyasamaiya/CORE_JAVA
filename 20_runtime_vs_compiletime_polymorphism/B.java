class X1{
    void pro(){
        System.out.println("Hello");
    }
}
class X2 extends X1{
    void pro(){
        System.out.println("Hi");
    }
}

class X3 extends X1{
    void pro(){
        System.out.println("Namaste");
    }
}

class B{
    public static void main(String[] args){
        X1 x = new X2();

        x.pro();

        x = new X3();

        x.pro();
    }
}