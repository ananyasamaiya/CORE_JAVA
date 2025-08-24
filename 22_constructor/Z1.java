class A11{
    A11(int y){

    }
}

class Z1 extends A11{
    Z1(){
        super(pro());
         //----(Default or magic code run)
        pro();
    }

    int pro(){
        return 22;
    }
}

// Z1.java:9: error: cannot reference this before supertype constructor has been called
//         super(pro());
//               ^
// 1 error
