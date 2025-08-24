class X1{
    {
        System.out.println("H");
    }

    X1(){
        System.out.println("Q");
    }
}

class E extends X1{
    {
        System.out.println("A");
    }

    E(){
        System.out.println("K");
    }
    public static void main(String[] args){
        System.out.println("start main");

        E x = new E();
        
        System.out.println("start main");
    }
}