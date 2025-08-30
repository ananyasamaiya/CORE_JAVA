//FLoat doesn't have a constant pool
class H{
    public static void main(String[] args){
        Float a = 2.0f;
        Float b = 2.0f;

        Float c = 128.0f;
        Float d = 128.0f;

        System.out.println(a == b);
        System.out.println(c == d);
    }
}