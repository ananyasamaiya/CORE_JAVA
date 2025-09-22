class X {
    static class AA1 {
        static class AA2 {
            static class AA3 {
                static void pro() {
                    System.out.println("Hello");
                }
            }
        }
    }    

    public static void main(String[] args) {
        X.AA1.AA2.AA3.pro();
        AA1.AA2.AA3.pro();
    }
}