//constant pool have range from -128 to 127
class D1{
    public static void main(String[] args){
        Integer a = 127;
        Integer b = 127;

        Integer c = 128;
        Integer d = 128;

        System.out.println(a == b);
        System.out.println(c == d);
    }
}