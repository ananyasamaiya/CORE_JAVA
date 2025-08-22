/*
compiler sees we are class class level variable(static) with object reference variable(instance)
so it change object reference variable with class name 
so type of variable is runned

parent in this case
*/

class Y1{
    static int a = 17;
}

class Y2 extends Y1{
    static int a =23;
}

class B {
    public static void main(String[] args){
        Y1 x = new Y2();

        System.out.println(x.a); //17
    }
}