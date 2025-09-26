class A {
    String abc;

    public static void main(String[] args) {
        A x = new A();
        x.abc = "Rajiv";

        // Shallow Cloning
        A y = x;
        
        System.out.println(x.abc);
        System.out.println(y.abc);

        y.abc = "Raja";
        System.out.println("~~~~~~~~~~~~~");
        
        System.out.println(x.abc);
        System.out.println(y.abc);

        System.out.println("~~~~~~~~~~~~~");
        System.out.println(x);
        System.out.println(y);
        System.out.println(x==y);
    }
}