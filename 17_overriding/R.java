class Z2{
    void pro(int a,float b){

    }
}

class R extends Z2{
    //method overriding
    void pro(int a,float b){
        
    }

    //method overloading : parameter body mismatch :parameter sequence mismatch

    void pro(float b, int a){

    }
}