//constant pool have range from -128 to 127
class E{
    public static void main(String[] args){
        Short a = 127;
        Short b = 127;

        Short c = 128;
        Short d = 128;

        System.out.println(a == b);
        System.out.println(c == d);
    }
}