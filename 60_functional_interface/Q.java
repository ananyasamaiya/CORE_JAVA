interface AAA {
    void pro(int x);
    void info();
}

class Q {
    public static void main(String[] args) {
        AAA x = () -> System.out.println("Hello");

        // x.pro();
        x.info();
    }    
}


// Q.java:8: error: incompatible types: AAA is not a functional interface
//         AAA x = () -> System.out.println("Hello");
//                 ^
//     multiple non-overriding abstract methods found in interface AAA
// 1 error