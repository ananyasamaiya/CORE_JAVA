class X3{
    private int y = 111;

    int info(){
        return y;
    }
}
class I extends X3{
    int y = 55;
    public static void main(String[] args){
        I g = new I();
        g.pro();
    }

    void pro(){
        int y = 17;
        System.out.println(y);
        System.out.println(this.y);
        System.out.println(info());
    }
}