class J{
    static void pro(String x, int... y){
        System.out.println(x);
        System.out.println(y.length);
    }
    public static void main(String[] args) {
        pro("raju", 12, 34, 45, 67);
    } 
}