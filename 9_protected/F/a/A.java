package a;
class A extends Student{
     public static void main(String[] args) throws 
    CloneNotSupportedException 
    {
        A x = new A();
        x.name = "jagjeet";
        x.age = 14;

        A y = (A)x.clone();

        System.out.println(y.name);
        System.out.println(y.age);

        System.out.println(x);
        System.out.println(y);
    }
}
