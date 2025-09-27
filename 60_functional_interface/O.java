@FunctionalInterface
interface O1 {
    int add(int a, int b);
}

// class O2 implements O1 {
//     public int add(int a, int b) {
//         int sum = 0;
//         sum = a + b;
//         return sum;
//     }
// }

// (a, b) -> {
//     int sum = 0;
//     sum = a + b;
//     return sum;
// };


class O {
    public static void main(String[] args) {
        // O1 x = new O2();
        O1 x = (a, b) -> {
                    int sum = 0;
                    sum = a + b;
                    return sum;
                };

        int y = x.add(11, 22);

        System.out.println(y);
    }
}