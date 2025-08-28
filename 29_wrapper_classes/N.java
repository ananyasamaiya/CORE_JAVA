class N{
    public static void main(String[] args){
        int x = 2;

        Byte a = x;
        Character b = x;
        Short c = x;

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}

// N.java:5: error: incompatible types: int cannot be converted to Byte
//         Byte a = x;
//                  ^
// N.java:6: error: incompatible types: int cannot be converted to Character
//         Character b = x;
//                       ^
// N.java:7: error: incompatible types: int cannot be converted to Short
//         Short c = x;
//                   ^
// 3 errors