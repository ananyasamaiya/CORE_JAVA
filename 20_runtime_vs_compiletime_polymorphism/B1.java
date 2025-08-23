/*
if we do not write pro in parent 
compilation error

compiler see -> type and there is no method in parent
it will not be sure of child have it or not so it will give error
*/

class X1{
    // void pro(){
    //     System.out.println("Hello");
    // }
}
class X2 extends X1{
    void pro(){
        System.out.println("Hi");
    }
}

class X3 extends X1{
    void pro(){
        System.out.println("Namaste");
    }
}

class B1{
    public static void main(String[] args){
        X1 x = new X2();

        x.pro();

        x = new X3();

        x.pro();
    }
}

// B1.java:22: error: cannot find symbol
//         x.pro();
//          ^
//   symbol:   method pro()
//   location: variable x of type X1
// B1.java:26: error: cannot find symbol
//         x.pro();
//          ^
//   symbol:   method pro()
//   location: variable x of type X1
// 2 errors