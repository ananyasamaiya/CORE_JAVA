//not overriding all the method
abstract class X5{
    abstract void aaa();
    abstract void bbb();
}

class L extends X5{
    void aaa(){

    }
    
}

// L.java:7: error: L is not abstract and does not override abstract method bbb() in X5
// class L extends X5{
// ^
// 1 error
