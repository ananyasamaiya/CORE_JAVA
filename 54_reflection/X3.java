class X3 {
    static {
        System.out.println("---------S---------");
        int y = 12/0;
        System.out.println("---------E---------");
    }
    public static void main(String[] args) {
        System.out.println("----main -----");
    }    
}

// ---------S---------
// Exception in thread "main" java.lang.ExceptionInInitializerError
// Caused by: java.lang.ArithmeticException: / by zero
//         at X3.<clinit>(X3.java:4)