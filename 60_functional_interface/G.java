@FunctionalInterface
interface G1 {
    void pro();
}

class G2 implements G1 {
    public void pro() {
        System.out.println("Hello");
    }
}

class G {
    public static void main(String[] args) {
        G1 x = new G2();

        x.pro();
    }
}