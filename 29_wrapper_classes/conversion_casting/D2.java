class D2{
    public static void main(String[] args){

        //not ok
        // pro(65);

        //ok
        pro((char)65);
    }

    static void pro(char x){
        System.out.println(x);
    }
}
// D2.java:5: error: incompatible types: possible lossy conversion from int to char
//         pro(65);
//             ^
// Note: Some messages have been simplified; recompile with -Xdiags:verbose to get full output
// 1 error