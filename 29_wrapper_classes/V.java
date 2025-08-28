//here boxing and conversion is allowed because Boolean is child of Object

class V{
    public static void main (String[] args){
        Object a = true;
        Object b = 2.3;
        Object c= 2.3f;
        Object d = 23;
        Object e = 23L;
        Object f = 'A';

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
    }
}