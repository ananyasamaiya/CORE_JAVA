//local variable is given priority
class E{
    int x = 23;

    public static void main(String[] args){
        E e = new E();
        e.pro();
    }

    void pro(){
        // int x = 11;
        System.out.println(x);
    }
}