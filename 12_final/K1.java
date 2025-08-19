// 2 option for member variable
// 1 declare cum initializtion 
// 2 Intialized inside (any) constructor in all the contructor made in class
// if static inside static initialized code block


//Static variable is loaded before constructor call
//so when class obj is made so there is an error
// if static inside static initialized code block

class K{
    static final int f;
     static {
        f = 99;
     }
}