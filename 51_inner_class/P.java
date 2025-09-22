class P{
    // inner class
    class X1{

    }

    //nested class
    static class Y1{

    }
    public static void main(String[] args){
        P p = new P();
        X1 z = p.new X1();

        Y1 a = new Y1();
    }

}