class X1{
    static void aaa(){
        System.out.println("U");
        X3.ccc();
    }
}
class C{
    public static void main(String[] args){
        X2.bbb();
        System.out.println("R");
    }
}

class X2{
    static void bbb(){
        System.out.println("K");
        X1.aaa();
    }
}

class X3{
    static void ccc(){
        System.out.println("Y");
        int y = 12 / 0;
    }
}