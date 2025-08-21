//overriding method must return double (same primitive type)

class X8{
    double pro(){
        return 9.7;
    }
}
class H extends X8{
    float pro(){
        return 3.5f;
    }
}

// H.java:9: error: pro() in H cannot override pro() in X8
//     float pro(){
//           ^
//   return type float is not compatible with double
// 1 error
