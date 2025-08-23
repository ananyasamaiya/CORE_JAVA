class E{
    //contructor overloading
    E(){
       System.out.println("Hi"); 
    }

    E(int y){
        System.out.println("Hello"); 
    }
    public static void main(String[] args){
        E a = new E();

        E b = new E(3);

        System.out.println(a);
        System.out.println(b);
    }
}