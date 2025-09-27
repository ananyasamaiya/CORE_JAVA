class B1{
    private static B1 x;

    private B1(){

    }
}

//lazy Initialization

public static B1 getInstance(){
    if(x == null)
        x = new B1();

    return x;
}

class I {
    public static void main(String[] args) {
        B1 x = B1.getInstance();
        B1 y = B1.getInstance();
        B1 z = B1.getInstance();

        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
    }
}