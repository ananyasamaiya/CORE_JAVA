//when we put child object in parent variable which have overriding method
//when we call that method child class method is called 

class W3{
    void pro()
    {
        System.out.println("Hi");
    }
}

class W4 extends W3{
    void pro()
    {
        System.out.println("Hello");
    }
}

class W{
    public static void main(String[] args){
        W3 a = new W4();

        a.pro(); //Dynamic Method Dispatch    (Runtime Polymorphism)
    }
}

/*
compiler sees type of variable
it check if parent variable have pro method if it did compilation pass

at runtime 
check whose constructor is called 

so method of W4 is call



*/
