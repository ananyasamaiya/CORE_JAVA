/*
static initialization block is called when object is loaded

frame memory is allocated to static initialization block and put in stack before main call

instance initialization block is not allocated frame memory
*/

class H{
    static int x = 9;

    static void pro(){

    }

    static {
        System.out.println("AAA"); 
    }

    public static void main(String[] args){
        System.out.println("main start");

        H a = new H();
        H b = new H();
        H c = new H();

         System.out.println("main ends");


    }
}