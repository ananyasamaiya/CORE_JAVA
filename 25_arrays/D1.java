class D1{
    public static void main(String[] args){
        char a = 'B';
        byte b = 34;
        short c = 86;
        int d = 103;
        long e = 899l;
        float f = 5.9f;
        double g = 88.34;

        int[] x = {a,b,c,d,(int)e,(int)f,(int)g};

        for(int next: x)
            System.out.println(next);

    }
}