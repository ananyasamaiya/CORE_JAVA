@FunctionalInterface
interface Z {
    void pro();
    void info();    
}


// Z.java:1: error: Unexpected @FunctionalInterface annotation
// @FunctionalInterface
// ^
//   Z is not a functional interface
//     multiple non-overriding abstract methods found in interface Z
// 1 error