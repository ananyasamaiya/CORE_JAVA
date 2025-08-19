// 2 option for member variable
// 1 declare cum initializtion 
// 2 Intialized inside (any) constructor in all the contructor made in class
// if static inside static initialized code block


//if we have not declare cum initialized 
//we have to initialized in all the constructor
class I2{
    final int q;

    I2(){
       q = 9;
    }
    I2(int s){

    }
}

// I2.java:14: error: variable q might not have been initialized
//     }
//     ^
// 1 error
