// 2 option for member variable
// 1 declare cum initializtion 
// 2 Intialized inside (any) constructor in all the contructor made in class
// if static inside static initialized code block


// we have not initialized in any way
class I1{
    final int e;

    I1(){
       
    }
    I1(int i){

    }
}

// I1.java:11: error: variable e might not have been initialized
//     }
//     ^
// I1.java:14: error: variable e might not have been initialized
//     }
//     ^
// 2 errors