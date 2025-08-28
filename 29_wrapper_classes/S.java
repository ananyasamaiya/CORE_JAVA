class S{
    public static void main(String[] args){
        System.out.println(pro());
    }

    static Short pro(){
        // return 4;
        return 32768; //not ok
    }
}

// S.java:8: error: incompatible types: int cannot be converted to Short
//         return 32768; //not ok
//                ^
// 1 error
