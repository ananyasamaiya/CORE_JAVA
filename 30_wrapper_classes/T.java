class T{
    public static void main(String[] args){
        int a = 67;

        String x = Integer.toString(a, 2);
        String y = Integer.toString(a, 8);
        String z = Integer.toString(a, 16);

        System.out.println(x);
        System.out.println(y);
        System.out.println(z);

    }
}
