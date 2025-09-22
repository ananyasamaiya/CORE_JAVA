class H{
    class A{

    }

    public static void main(String[] args){
        A x = new H().new A();

        //OR

        H h = new H();
        A d = h.new A();
    }
}