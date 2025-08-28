//here boxing and conversion is allowed because all are child of Number class
class W{
    public static void main(String[] args){
        byte m =7;
        short n = 8;
        int o = 9;
        long p = 10;
        float q = 11;
        double r = 12;

        Number a = m;
        Number b = n;
        Number c = o;
        Number d = p;
        Number e = q;
        Number f = r;


        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
    }
}