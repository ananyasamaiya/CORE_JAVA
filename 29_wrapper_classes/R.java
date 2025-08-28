class R{
    public static void main(String[] args){
        System.out.println(pro());
    }

    static Byte pro(){
        // return 2;
        // return 128; //not ok
    }
}

// R.java:8: error: incompatible types: int cannot be converted to Byte
//         return 128;
//                ^
// 1 error