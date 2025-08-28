class O{
    public static void main(String[] args){
        pro(2);
    }

    static void pro(Byte a){
        System.out.println(a);
    }
}
// O.java:3: error: incompatible types: int cannot be converted to Byte
//         pro(2);
//             ^
// Note: Some messages have been simplified; recompile with -Xdiags:verbose to get full output
// 1 error