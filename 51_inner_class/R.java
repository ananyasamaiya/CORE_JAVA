class R{
    static private int q = 89;

    static class Y3{
        private void pro(){
            System.out.println(q);
        }
    }
    public static void main(String[] args){
        Y3 w = new Y3();
        w.pro();
    }
}