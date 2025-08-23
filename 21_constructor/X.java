class X{
    X(){
        this(34);
    }

    X(int a){
        this();
    }
}

// X.java:2: error: recursive constructor invocation
//     X(){
//     ^
// 1 error