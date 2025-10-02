class F{
    int x = 23;

    public static void main(String[] args){
        F e = new F();
        e.pro();
    }

    void pro(){
        int x = 11;
        System.out.println(x);
        System.out.println(this.x);
    }
}