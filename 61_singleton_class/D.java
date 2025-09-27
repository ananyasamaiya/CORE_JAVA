import java.io.Console;

class D {
    public static void main(String[] args) {
        Console x1 = System.console();
        Console x2 = System.console();
        Console x3 = System.console();

        System.out.println(x1);
        System.out.println(x2);
        System.out.println(x3);
    }    
}