/*
frame memory is allocated to static initialization block and put in stack before main call
*/

class H1{
    static int x = 9;

    static void pro(){

    }

    static {
        System.out.println("AAA"); 
        int y = 22/0;
    }

    public static void main(String[] args){
        System.out.println("main start");

        H1 a = new H1();
        H1 b = new H1();
        H1 c = new H1();

         System.out.println("main ends");


    }
}

// AAA
// Exception in thread "main" java.lang.ExceptionInInitializerError
// Caused by: java.lang.ArithmeticException: / by zero
//         at H1.<clinit>(H1.java:14)
