//difference btw class and interface

interface X1{
    void pro();  //implicitly marked abstract 
}

class D{
    void info(); //must be explicity declared abstract
}

// D.java:8: error: missing method body, or declare abstract
//     void info(); //must be explicity declared abstract
//          ^
// 1 error
