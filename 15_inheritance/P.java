class A extends B implements E{}

class B extends C implements D{}

class C{}

interface D {}

interface E extends F,G{}

interface F{}

interface G{}

class P{
    public static void main(String[] args){
        A x = new A();

        System.out.println(x instanceof A);
        System.out.println(x instanceof B);
        System.out.println(x instanceof C);
        System.out.println(x instanceof D);
        System.out.println(x instanceof E);
        System.out.println(x instanceof F);
        System.out.println(x instanceof G);
    }
}