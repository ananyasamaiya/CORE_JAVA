//can't call super or this with static context
class B{
    static void pro(){
        System.out.println(this);
    }

   static  {
        System.out.println(this);
    }

    B(){
        super(this);
    }
}
// F:\Java\examples\x_this_super>javac B.java
// B.java:4: error: non-static variable this cannot be referenced from a static context
//         System.out.println(this);
//                            ^
// B.java:8: error: non-static variable this cannot be referenced from a static context
//         System.out.println(this);
//                            ^
// B.java:12: error: cannot reference this before supertype constructor has been called
//         super(this);
//               ^
// B.java:12: error: constructor Object in class Object cannot be applied to given types;
//         super(this);
//         ^
//   required: no arguments
//   found:    B
//   reason: actual and formal argument lists differ in length
// 4 errors