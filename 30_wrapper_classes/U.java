class U{
    public static void main(String[] args){
        int a = 67;

        String x = Integer.toBinaryString(a);
        String y = Integer.toOctalString(a);
        String z = Integer.toHexString(a);

        System.out.println(x);
        System.out.println(y);
        System.out.println(z);

    }
}
