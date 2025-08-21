class X1{}
class X2 extends X1{}
class X3 extends X2{}

class A{
    public static void main(String[] args){

        X3 a = new X3();

        //polymorphic assignment
        X2 b = new X3();
        X1 c = new X3();
        Object d = new X3();

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    }
}