

class E2 implements Cloneable {
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


class E1 extends E2 {
    private static E1 x;

    private E1() {

    }

    // Lazy Initialization
    public static E1 getInstance() {
        if(x == null)
            x = new E1();    
        
        return x;
    }

    public E1 clone() {
        try {
            throw new CloneNotSupportedException("How dare you create an object of a singleton class");
        } catch(CloneNotSupportedException e) {
            e.printStackTrace();
        }

        return x;
    }
} 

class N1 {
    public static void main(String[] args) {
        E1 x = E1.getInstance();

        E1 y = (E1)x.clone();

        System.out.println(x);
        System.out.println(y);
        System.out.println(x==y);
    }
}