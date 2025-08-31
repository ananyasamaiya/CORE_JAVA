//unchecked Exception if we make a catch for a exception which will not come 
// compiler will have no problem

class H{
    public static void main(String[] args){
        System.out.println("A");

        try{
            String input = args[0];
        } catch(ArithmeticException e){
            System.out.println(e);
        }
        
        System.out.println("B");
    }
}