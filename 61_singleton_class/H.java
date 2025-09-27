class A4 {
    // Early Initialization
    private static A4 tmp = new A4();

    private A4() {

    }

    public static A4 getInstance() {
        return tmp;
    }
}

class H {
    public static void main(String[] args) {
        A4 x = A4.getInstance();
        A4 y = A4.getInstance();
        A4 z = A4.getInstance();

        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
    }
}