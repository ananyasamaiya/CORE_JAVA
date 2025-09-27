import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

enum B3 {
    OBJ

    // private static B3 x;

    // private B3() {

    // }

    // // Lazy Initialization
    // public static B3 getInstance() {
    //     if(x == null)
    //         x = new B3();    
        
    //     return x;
    // }
} 

class J1 {
    public static void main(String[] args) throws IllegalAccessException, InvocationTargetException, InstantiationException {
        // B3 x = B3.getInstance();
        B3 x = B3.OBJ;

        Class klass = B3.class;

        Constructor[] arr = klass.getDeclaredConstructors();

        arr[0].setAccessible(true);

        B3 y = (B3)arr[0].newInstance();

        System.out.println(x);
        System.out.println(y);
        System.out.println(x==y);
    }
}


// Exception in thread "main" java.lang.IllegalArgumentException: Cannot reflectively create enum objects
//         at java.base/java.lang.reflect.Constructor.newInstanceWithCaller(Constructor.java:492)
//         at java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:480)
//         at J1.main(J1.java:33)