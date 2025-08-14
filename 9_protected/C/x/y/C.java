//We can access protected member by child and also by child of child
//using child object only by inheritance 
package x.y;

class C{
    public static void main(String[] args)
    {
        B a = new B();

        System.out.println(a.x);

    }

//     x\y\C.java:8: error: cannot find symbol
//         System.out.println(a.x);
//                             ^
//   symbol:   variable x
//   location: variable a of type B
// 1 error
}