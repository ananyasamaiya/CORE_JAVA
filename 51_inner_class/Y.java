class Y {
    static int a = 1;
    static class AA1 {
        static int a = 2;
        static class AA2 {
            static int a = 3;
            static class AA3 {
                static int a = 4;
                static void pro() {
                    int a = 5;
                    System.out.println(a);
                    System.out.println(AA3.a);
                    System.out.println(AA2.a);
                    System.out.println(AA1.a);
                    System.out.println(Y.a);
                }
            }
        }
    }    

    public static void main(String[] args) {        
        AA1.AA2.AA3.pro();
    }
}