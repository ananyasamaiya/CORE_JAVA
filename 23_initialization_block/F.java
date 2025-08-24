class X1{
    // {
    //     System.out.println("H");
    // }

    X1(){
        System.out.println("H--");
        System.out.println("Q");
    }
}

class F extends X1{
    // {
    //     System.out.println("A");
    // }

    F(){
        System.out.println("A--");
        System.out.println("K");
    }
    public static void main(String[] args){
        System.out.println("start main");

        F x = new F();
        
        System.out.println("start main");
    }
}