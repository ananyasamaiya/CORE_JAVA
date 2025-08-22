/*
in case of variable type of variable is checked on both run time and compile time

parent in this case
*/

class X1{
    int a = 9;
}

class X2 extends X1{
    int a = 15;
}

class A {
    public static void main(String[] args){
        X1 x = new X2();

        System.out.println(x.a);  //9
    }
}