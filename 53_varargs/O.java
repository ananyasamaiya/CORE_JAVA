class O {
    static void pro(String... names, int... marks) {

    }

    public static void main(String[] args) {
        pro("om","ram","raj", 12, 34, 56);
    }    
}



// O.java:2: error: varargs parameter must be the last parameter
//     static void pro(String... names, int... marks) {
//                               ^
// 1 error