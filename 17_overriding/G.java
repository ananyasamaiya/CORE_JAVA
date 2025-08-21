//overridding method should have same data type

class X7{
    void pro(){

    }

}

class G extends X7{
    //overriding method must be void
    int pro(){
        
    }
}


// G.java:12: error: pro() in G cannot override pro() in X7
//     int pro(){
//         ^
//   return type int is not compatible with void
// 1 error
