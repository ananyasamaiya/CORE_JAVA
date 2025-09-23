class K {
    static void pro(String x, int... y) {
        System.out.println(x);
        for(int next : y)
            System.out.println(next);
    }

    public static void main(String[] args) {
        byte a = 10;
        short s = 20;
        char c = 65;
        
        pro("raju", a, s, c, 2);
    }    
}