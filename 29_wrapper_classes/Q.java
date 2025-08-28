class Q{
    public static void main(String[] args){
        process(2);
    }

    static void process(Character a){
        System.out.println(a);
    }
}

// Q.java:3: error: incompatible types: int cannot be converted to Character
//         process(2);
//                 ^
// Note: Some messages have been simplified; recompile with -Xdiags:verbose to get full output
// 1 error