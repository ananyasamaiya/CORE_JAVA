class R{
    int k = 333;

    class Y extends A1 {
        int k = 33;

        void info() {
            int k = 3;
            System.out.println(k);
            System.out.println(this.k);
            System.out.println(super.k);
            System.out.println(R.this.k);
        }
    }   
    
    public static void main(String[] args) {
        R r = new R();
        Y y = r.new Y();

        y.info();
    }
}

class A1 {
    int k = 3333;
}