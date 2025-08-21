class Q1{
    /*private*/ static void pro(){

    }
}

class Z extends Q1{
    static int pro(){
        return 12;

    }
}

// Z.java:8: error: pro() in Z cannot hide pro() in Q1
//     static int pro(){
//                ^
//   return type int is not compatible with void
// 1 error
