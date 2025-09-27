
class D4 implements Cloneable {
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


class D3 extends D4 {
    private static D3 x;

    private D3() {

    }

    // Lazy Initialization
    public static D3 getInstance() {
        if(x == null)
            x = new D3();    
        
        return x;
    }

    public D3 clone() {
        return x;
    }
} 

class N {
    public static void main(String[] args) {
        D3 x = D3.getInstance();

        D3 y = (D3)x.clone();

        System.out.println(x);
        System.out.println(y);
        System.out.println(x==y);
    }
}