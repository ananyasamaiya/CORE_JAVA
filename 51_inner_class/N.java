abstract class X1{
    abstract void aaa();
}

class N{
    X1 r = new X1(){
        void aaa(){
            System.out.println("Hiiiii");
        }
        void bbb(){
            System.out.println("Byeeeee");
        }
    };

    public static void main(String[] args) {
        M m = new M();

        // m.r.bbb();
        m.r.aaa();
    }
}
