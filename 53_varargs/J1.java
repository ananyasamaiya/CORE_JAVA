class J1 {
    static void pro(String x, int... y) {
        System.out.println(x);
        for(int next : y)
            System.out.println(next);
    }

    public static void main(String[] args) {
        pro("raju", 12, 34, 45, 67);
    }    
}