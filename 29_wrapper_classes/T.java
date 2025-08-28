class T{
    public static void main(String[] args){
        System.out.println(pro());
    }

    static Character pro(){
        return 68;
        // return 65536; //not ok
    }
}
// T.java:8: error: incompatible types: int cannot be converted to Character
//         return 65536; //not ok
//                ^
// 1 error
