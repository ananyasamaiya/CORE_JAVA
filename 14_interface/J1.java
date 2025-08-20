//abstract class can not have object 
//as interface is a 100% abstract so we cant make object of interface

interface X6 {

}
class J1{
    public static void main(String[] args){
        X6 a = new X6();
    }
}
// 1.java:9: error: X6 is abstract; cannot be instantiated
//         X6 a = new X6();
//                ^
// 1 error
