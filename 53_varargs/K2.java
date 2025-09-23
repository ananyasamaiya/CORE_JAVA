class K2 {
    static void pro(String x, int... y) {
        System.out.println(x);
        for(int next : y)
            System.out.println(next);
    }

    public static void main(String[] args) {
        byte a = 10;
        short s = 20;
        char c = 65;

        long l = 34;
        float f = 8.9f;
        double d = 12.3;

        // int y1 = (int)67L;
        // int y2 = (int)7.8f;
        // int y3 = (int)7.8;
                
        pro("raju", a, s, c, 2, (int)l, (int)f, (int)d);
    }    
}