//inheriting a class and not redifining/overriding abstract method in child class

abstract class X2{
    abstract void pro();
} 

class K extends X2{

}

// K.java:7: error: K is not abstract and does not override abstract method pro() in X2
// class K extends X2{
// ^
// 1 error