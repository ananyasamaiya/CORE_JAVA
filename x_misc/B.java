import java.io.Console;

class B{
    public static void main(String[] args){
        Console x = System.console();

        System.out.print("Enter your name: ");
        String name = x.readLine();

        System.out.println("~~~~~~~~~~~");

        System.out.println("Name: " + name);
    }
}