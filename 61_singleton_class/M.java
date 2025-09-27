
class D2 implements Cloneable {
    public Object clone() {
        Object x = null;

        try {
            x = super.clone();
        } catch(CloneNotSupportedException e) {
            e.printStackTrace();
        }

        return x;
    }
}

class D1 extends D2 {
    private static D1 x;

    private D1() {

    }

    // Lazy Initialization
    public static D1 getInstance() {
        if(x == null)
            x = new D1();    
        
        return x;
    }
} 

class M {
    public static void main(String[] args)  {
        D1 x = D1.getInstance();

        D1 y = (D1)x.clone();

        System.out.println(x);
        System.out.println(y);
        System.out.println(x==y);
    }
}