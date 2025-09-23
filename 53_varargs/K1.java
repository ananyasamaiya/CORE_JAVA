class K1 {
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

        // int y1 = 67L;
        // int y2 = 7.8f;
        // int y3 = 7.8;
                
        pro("raju", a, s, c, 2, l);
    }    
}


// K1.java:21: error: method pro in class K cannot be applied to given types;
//         pro("raju", a, s, c, 2, l);
//         ^
//   required: String,int[]
//   found:    String,byte,short,char,int,long
//   reason: varargs mismatch; possible lossy conversion from long to int
// 1 error