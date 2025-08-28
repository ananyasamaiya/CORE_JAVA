class M{
    public static void main(String[] args){
        Byte a = 128;
        Character b = 65536;
        Short c = 32768;

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}
// M.java:3: error: incompatible types: int cannot be converted to Byte
//         Byte a = 128;
//                  ^
// M.java:4: error: incompatible types: int cannot be converted to Character
//         Character b = 65536;
//                       ^
// M.java:5: error: incompatible types: int cannot be converted to Short
//         Short c = 32768;
//                   ^
// 3 errors