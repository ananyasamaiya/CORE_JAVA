class D{
    private int h = 11;

    void xyz(){
        class T{
            private void abc(){
                System.out.println(h);
            }
        }
        T t = new T();
        t.abc();
    }
    public static void main(String[] args){
        D x = new D();

        x.xyz();
    }
}