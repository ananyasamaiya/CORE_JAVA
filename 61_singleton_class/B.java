import java.lang.reflect.Constructor;
import java.io.Console;
import java.lang.reflect.InvocationTargetException;

class B{
    A static void main(String[] args) throws InstantiationException, IllegalAccessException,InvocationTargetException{
        Class klass = Console.class;

        Constructor[] arr = klass.getDeclaredConstructors();

        Console x = (Console)arr[0].newInstance();
    }
}


// Exception in thread "main" java.lang.IllegalAccessException: class B cannot access a member of class java.io.Console (in module java.base) with modifiers "private"
//         at java.base/jdk.internal.reflect.Reflection.newIllegalAccessException(Reflection.java:392)
//         at java.base/java.lang.reflect.AccessibleObject.checkAccess(AccessibleObject.java:674)
//         at java.base/java.lang.reflect.Constructor.newInstanceWithCaller(Constructor.java:489)
//         at java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:480)
//         at B.main(B.java:10)