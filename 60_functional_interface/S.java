interface CC {
    int pro();
}

class S {
    public static void main(String[] args) {
        CC x = () -> 45;

        // int y = x.pro();
        String y = x.pro();

        System.out.println(y);
    }
}


// S.java:10: error: incompatible types: int cannot be converted to String
//         String y = x.pro();
//                         ^
// 1 error