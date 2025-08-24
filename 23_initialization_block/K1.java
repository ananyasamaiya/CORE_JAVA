class Y2{
    {
        System.out.println("A");
    }

    static{
        System.out.println("B");
    }

    {
        System.out.println("D");
    }

    static{
        System.out.println("E");
    }
}

class K1 /*extends Y2*/{
    {
        System.out.println("C");
    }

    static{
        System.out.println("Y");
    }

    {
        System.out.println("M");
    }

    static{
        System.out.println("H");
    }

    public static void main(String[] args){
        System.out.println("main start");
        // K1 x = new K1();
        Y2 x = new Y2();
        System.out.println("main end");
    }
}