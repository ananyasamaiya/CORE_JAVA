class F{
    int x = 99;

    void pro(){
        System.out.println("Hello...");
    }

    class A{

    }
    void info(){
        System.out.println(x);
        pro();

        A a = new A();
        System.out.println(a);
    }
    public static void main(String[] args) {
        F e = new F();
        e.info();
    }

}