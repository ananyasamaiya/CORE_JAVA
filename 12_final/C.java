/*final*/ class X3{
    final void pro()
    {
        //code
    }
    void info(){
        //code
    }
}

class C extends X3{

    void aaa(){
        //code
    }

    void pro(){ //can't do this

    }

    void info(){
        //code
    }
}

// C.java:17: error: pro() in C cannot override pro() in X3
//     void pro(){ //can't do this
//          ^
//   overridden method is final
// 1 error