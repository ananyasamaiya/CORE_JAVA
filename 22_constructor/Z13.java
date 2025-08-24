//Z13 is a singleton class ex: Console

final class Z13{
    private static Z13 x;

    private Z13(){

    }
    public static Z13 getInstance() {
        if(x == null)
            x = new Z13();
        
        return x;
    }
}

class XYZ{
    public static void main(String[] args){
        Z13 a = Z13.getInstance();
        Z13 b = Z13.getInstance();
        Z13 c = Z13.getInstance();

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        System.out.println(System.console());
        System.out.println(System.console());
        System.out.println(System.console());
    }
}