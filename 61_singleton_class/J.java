import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

class B2 {
    private static B2 x;

    private B2() {

    }

    // Lazy Initialization
    public static B2 getInstance() {
        if(x == null)
            x = new B2();    
        
        return x;
    }
} 

class J {
    public static void main(String[] args) throws IllegalAccessException, InvocationTargetException, InstantiationException {
        B2 x = B2.getInstance();

        Class klass = B2.class;

        Constructor[] arr = klass.getDeclaredConstructors();

        arr[0].setAccessible(true);

        B2 y = (B2)arr[0].newInstance();

        System.out.println(x);
        System.out.println(y);
        System.out.println(x==y);
    }
}