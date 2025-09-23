class T {
    
    static void pro(int... x) {
        System.out.println("Hello");
    }

    static void pro(Integer... x) {
        System.out.println("Hi");
    }
    
    public static void main(String[] args) {
        pro(12, 34, 67);
    }
}


// T.java:12: error: reference to pro is ambiguous
//         pro(12, 34, 67);
//         ^
//   both method pro(int...) in T and method pro(Integer...) in T match
// 1 error