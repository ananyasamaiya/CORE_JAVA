class Q1 {
    static int pro() {
        @Deprecated
        int y = 90;

        System.out.println(y);

        return y;
    }
}

class Q {
    public static void main(String[] args) {
        int x = Q1.pro();

        System.out.println(x);
    }
}