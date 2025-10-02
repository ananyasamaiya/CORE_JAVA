import java.util.Scanner;

class C{
    public static void main(String[] args){
        Scanner x = new Scanner(System.in);

        System.out.print("Enter your name: ");
        // String name = x.next();
        String name = x.nextLine();

        System.out.println("~~~~~~~~~~~");

        System.out.println("Name-> " + name);
    }
}