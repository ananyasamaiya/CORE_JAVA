class X1{
    void pro(){
        // code
    }

    void info(){
        //code
    }
}

class A extends X1{
    //pro() inherited and accepted as it is..

    //new implementation: afterall a specialized version of
    //parent class X1
    void aaa(){
        //code
    } 

    //inherited and modified (method overriding)
    void info(){
        // modified code
    }
}