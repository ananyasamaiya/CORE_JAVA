//there is no rule in return type of overriding method
//parameter body should me different 
class E1{
    void pro(){

    }

    int pro(){
        return 0;
    }
}

// E1.java:8: error: method pro() is already defined in class E
//     int pro(){
//         ^
// 1 error