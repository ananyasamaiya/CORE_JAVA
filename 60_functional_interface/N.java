@FunctionalInterface
interface N1 {
    int add(int a, int b);
}

// class N2 implements N1 {
//     public int add(int a, int b) {
//         return a + b;
//     }
// }

// (a, b) ->  a + b;


class N {
    public static void main(String[] args) {
        // N1 x = new N2();
        N1 x = (a, b) ->  a + b;;

        int y = x.add(10, 20);

        System.out.println(y);
    }
}