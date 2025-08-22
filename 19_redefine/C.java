/*
compile check -> type of variable (pass bcz parent have pro)
runtime check -> Object which is called

so in this case child method is called

*/

class Z1{
    void pro(){
        System.out.println("pro() in Parent");
    }
}

class Z2 extends Z1{
    void pro(){
        System.out.println("pro() in Child");
    }
}

class C {
    public static void main(String[] args){
        Z1 a = new Z2();

        a.pro();//Dynamic method Dispatch ---> Runtime Polymorphism 
        // pro() in Child
    }
}