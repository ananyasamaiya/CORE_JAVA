//Double doesn't have a constant pool
class H1{
    public static void main(String[] args){
        Double a = 2.0;
        Double b = 2.0;

        Double c = 128.0;
        Double d = 128.0;

        System.out.println(a == b);
        System.out.println(c == d);
    }
}