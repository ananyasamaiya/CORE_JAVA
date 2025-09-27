@FunctionalInterface
interface M1 {
    void pro(int x, float t);
}

// class M2 implements M1 {
//     public void pro(int x, float y) {
//         System.out.println(x + y);
//     }
// }

// (x, y) -> System.out.println(x + y);


class M {
    public static void main(String[] args) {
        // M1 x = new M2();

        M1 x = (a, b) -> System.out.println(a + b);

        x.pro(20, 30);
    }
}