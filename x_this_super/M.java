class M{
    int a = 1111111111;
    class X1{
        int a = 2;
        class X2{
            int a = 3;

            void pro(){
                System.out.println(M.this.a);
                System.out.println(M.X1.this.a);
                System.out.println(M.X1.X2.this.a);
            }
        }
    }

    public static void main(String[] args){
        M x = new M();
        M.X1 y = x.new X1();
        M.X1.X2 z = y.new X2();
        z.pro();
    }
}