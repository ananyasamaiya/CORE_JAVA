//overriding method return type must be  (class type)
//same
// or child class (pre class)

class X9{
    Animal pro(){
        return null;
    }
}

class I extends X9{
//    NOT OK
//     LivingBeing pro()
//     {
//         return null;
// //         I.java:13: error: pro() in I cannot override pro() in X9
// //     LivingBeing pro()
// //                 ^
// //   return type LivingBeing is not compatible with Animal
// // 1 error
//     }
// NOT OK
// Bus pro(){
//     return null;
// }
    // BDog pro(){
    //     return null;
    // }
    // Cow pro(){
    //     return null;
    // }
    // Cat pro(){
    //     return null;
    // }
    // Dog pro(){
    //     return null;
    // }
    // Animal pro(){
    //     return null;
    // }


}