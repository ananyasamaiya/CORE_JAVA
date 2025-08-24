/*
instance initialization block is not allocated frame memory
*/

class H2{
    {
        System.out.println("AAA");
        int y = 223/0; 
    }

    public static void main(String[] args){
        System.out.println("main start");

        H2 a = new H2();
        System.out.println("main ends");


    }
}
// main start
// AAA
// Exception in thread "main" java.lang.ArithmeticException: / by zero
//         at H2.<init>(H2.java:14)
//         at H2.main(H2.java:20)
