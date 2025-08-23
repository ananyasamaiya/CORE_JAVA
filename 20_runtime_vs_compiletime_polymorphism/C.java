import java.util.Scanner;
class Y1{
    void pro(){
        System.out.println("Hello");
    }
}
class Y2 extends Y1{
    void pro(){
        System.out.println("Hi");
    }
}

class Y3 extends Y1{
    void pro(){
        System.out.println("Namaste");
    }
}

class C{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Press 1 for Y2 child wala method...and 2 for Y3 child wala method:");

        int input = sc.nextInt();
        Y1 x = null;

        if(input == 1)
        {
            x = new Y2();
        }
        else if(input==2){
            x = new Y3();
        }
        else{
            System.out.println("Invalid input");
        }

        //Dynamic method Dispatch (Runtime polymorphorism)
        x.pro();
    }
}
