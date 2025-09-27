import java.lang.reflect.Constructor;
import java.io.Console;
import java.lang.reflect.InvocationTargetException;

class C{
    public static void main(String[] args) throws InstantiationException, IllegalAccessException,InvocationTargetException{
        Console y = System.console();
        Class klass = Console.class;

        Constructor[] arr = klass.getDeclaredConstructors();

        arr[0].setAccessible(true);
        Console x = (Console)arr[0].newInstance();

        System.out.println(x);
        System.out.println(x==y);
    }
}

// Exception in thread "main" java.lang.reflect.InaccessibleObjectException: Unable to make private java.io.Console() accessible: module java.base does not "opens java.io" to unnamed module @5b2133b1
//         at java.base/java.lang.reflect.AccessibleObject.checkCanSetAccessible(AccessibleObject.java:354)
//         at java.base/java.lang.reflect.AccessibleObject.checkCanSetAccessible(AccessibleObject.java:297)
//         at java.base/java.lang.reflect.Constructor.checkCanSetAccessible(Constructor.java:188)
//         at java.base/java.lang.reflect.Constructor.setAccessible(Constructor.java:181)
//         at C.main(C.java:12)