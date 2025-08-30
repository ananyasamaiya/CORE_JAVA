//constant pool have range from 0 to 127
class G{
    public static void main(String[] args){
        Character a = 127;
        Character b = 127;

        Character c = 128;
        Character d = 128;

        System.out.println(a == b);
        System.out.println(c == d);
    }
}