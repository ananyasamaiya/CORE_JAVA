//both bave same package location so we can access
// using both child and parent object
package a.b.c;

class C extends A{
    public static void main(String[] args)
    {
        C a = new C();
        System.out.println(a.w);  //27

        // A b = new A();
        // System.out.println(b.w); // 27
    }
}