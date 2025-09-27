@FunctionalInterface
interface J1 {
    void pro(int x);
}

class J2 implements J1 {
    public void pro(int x) {
        System.out.println(x);
    }
}

class J {
    public static void main(String[] args) {
        J1 x = new J2();

        x.pro(99);
    }
}