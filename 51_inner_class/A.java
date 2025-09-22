class A{
    void pro(){
        class ABCD{
            ABCD(){
                System.out.println("HI");
            }
        }

        ABCD x = new ABCD();
    }
    public static void main(String[] args){
        A z = new A();

        z.pro();
        z.pro();
        z.pro();
    }
}