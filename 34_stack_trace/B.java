class B{
    static void aaa(){
        System.out.println("U");
        ccc();
    }

    public static void main(String[] args){
        bbb();
        System.out.println("R");
    }

    static void bbb(){
        System.out.println("K");
        aaa();
    }

    static void ccc(){
        System.out.println("Y");
        int y = 12 / 0;
    }
}
// K
// U
// Y
// Exception in thread "main" java.lang.ArithmeticException: / by zero
//         at B.ccc(B.java:19)
//         at B.aaa(B.java:4)
//         at B.bbb(B.java:14)
//         at B.main(B.java:8)