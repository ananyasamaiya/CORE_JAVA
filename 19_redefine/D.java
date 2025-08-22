/*
compiler sees we are class class level method(static) with object reference variable(instance)
so it change object reference variable with class name 
so at runtime class method will be called

parent in this case
*/
class W1{
    static void pro(){
        System.out.println("pro() in Parent");
    }
}

class W2 extends W1{
    static void pro(){
        System.out.println("pro() in Child");
    }
}

class D{
    public static void main(String[] args){
        W1 a = new W2();

        a.pro(); //pro() in Parent
    }
}