class D{
    public static void main(String[] args){

        //not ok
        // pro(23);

        //ok
        pro((byte)23);
    }

    static void pro(byte x){
        System.out.println(x);
    }
}

// D.java:5: error: incompatible types: possible lossy conversion from int to byte
//         pro(23);
//             ^
// Note: Some messages have been simplified; recompile with -Xdiags:verbose to get full output
// 1 error
