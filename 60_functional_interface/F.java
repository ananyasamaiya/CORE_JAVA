@FunctionalInterface
interface F1 {
    void info();    
}

@FunctionalInterface
interface F extends F1 {
    void pro();    
}
 


// F.java:6: error: Unexpected @FunctionalInterface annotation
// @FunctionalInterface
// ^
//   F is not a functional interface
//     multiple non-overriding abstract methods found in interface F
// 1 error