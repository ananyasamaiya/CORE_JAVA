//Java doesn't support operator overloading
//all the necssary operator overloading in-bulid (done by) Java 
//we are not allowed to do it 


class R1{
    public static void main(String[] args){
        System.out.println("om" * 5);
    }
}

// R1.java:8: error: bad operand types for binary operator '*'
//         System.out.println("om" * 5);
//                                 ^
//   first type:  String
//   second type: int
// 1 error
