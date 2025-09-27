@FunctionalInterface
interface L1 {
    void pro(int x);
}

// class L2 implements L1 {
//     public void pro(int x) {
//         System.out.println(x);
//     }
// }

// x -> System.out.println(x);


class L {
    public static void main(String[] args) {
        // L1 x = new L1() {
        //     public void pro(int x) {
        //         System.out.println(x);
        //     }
        // };

        L1 x = y -> System.out.println(y);;;;;;;;;;;;;;;;;

        x.pro(999);
    }
}