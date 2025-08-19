//Static variable is loaded before constructor call
//so when class obj is made so there is an error

class K{
    static final int y;

    K(){
        y = 5;
    }
}

// K.java:8: error: cannot assign a value to final variable y
//         y = 5;
//         ^
// 1 error