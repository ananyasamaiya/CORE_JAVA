@FunctionalInterface
interface I1 {
    void pro();
}

// class G2 implements G1 {
//     public void pro() {
//         System.out.println("Hello");
//     }
// }

// () -> System.out.println("Hello");


class I {
    public static void main(String[] args) {
        // I1 x = new G3() {
        //     public void pro() {
        //         System.out.println("Hi");
        //     }
        // };

        I1 x = () -> System.out.println("Hello");

        x.pro();
    }
}