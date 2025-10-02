class X2{
    void pro(){
        System.out.println("pro() in parent(X2)");
    }
}
class H extends X2{
    void pro(){
        System.out.println("pro() in child(H)");
    }
    void info(){
        pro();
        super.pro();
    }
    public static void main(String[] args){
        H x = new H();
        x.info();
    }
}