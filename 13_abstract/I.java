//can't make object of abstract class

abstract class I{
    public static void main(String[] args){
        I x = new I();
    }
}

// I.java:5: error: I is abstract; cannot be instantiated
//         I x = new I();
//               ^
// 1 error