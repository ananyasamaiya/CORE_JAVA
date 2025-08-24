//every multiple initialization block will be called with every constructor call
class G1{
    {
        System.out.println("H");
    }

    {
        System.out.println("T");
    }

    {
        System.out.println("A");
    }

    G1() {
        System.out.println("D");
    }

    G1(int y) {
        System.out.println("J");
    }

    public static void main(String[] args){
        G1 x = new G1();
        G1 y = new G1(23);
    }
}