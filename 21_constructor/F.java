//can't define constructor in interface
class F{
    F(){

    }
}

abstract class X1{
    X1(){

    }
}

enum X2{
    X2(){

    }
}

interface X3{

}
//Constructor Definition is not allowed in an interface..

//F.java:25: error: <identifier> expected
//     X3(){
//       ^
// 1 error


// interface X3{
//     X3(){

//     }
//  }
