interface V1{
    void a1();
}

class L{
    private int q = 44;

    V1 x = new V1(){
        public void a1(){
            System.out.println(q);
        }
    };
    public static void main(String[] args){
        L w = new L();
        
        w.x.a1();
    }
}