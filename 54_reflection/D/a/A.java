//need to compile B.java first
package a;

class A{
    public static void main(String[] args) throws ClassNotFoundException{
        Class klass = Class.forName("b.x.y.B");

        System.out.println(klass);
    }
}