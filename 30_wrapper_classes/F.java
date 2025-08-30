//constant pool have range from -128 to 127
class F{
    public static void main(String[] args){
        Long a = 127L;
        Long b = 127L;

        Long c = 128L;
        Long d = 128L;

        System.out.println(a == b);
        System.out.println(c == d);
    }
}