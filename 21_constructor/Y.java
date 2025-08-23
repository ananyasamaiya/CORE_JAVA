class Y3{
    Y3(int x){

    }
}

class Y extends Y3{
    int q = 22;

    Y(){
        //super(24);
        super(q);
        //----(Default or magic code run)
        System.out.println(q);  
    }
}

// Y.java:12: error: cannot reference q before supertype constructor has been called
//         super(q);
//               ^
// 1 error
