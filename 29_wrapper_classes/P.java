class P{
    public static void main(String[] args){
        info(2);
    }
    static void info(Short a){
        System.out.println(a);
    }
}
// P.java:3: error: incompatible types: int cannot be converted to Short
//         info(2);
//              ^
// Note: Some messages have been simplified; recompile with -Xdiags:verbose to get full output
// 1 error