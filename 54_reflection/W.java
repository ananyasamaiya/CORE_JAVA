import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class W {
    public static void main(String[] args) throws IllegalAccessException, InvocationTargetException {
        BB a = new BB();
        a.name = "bharat";

        BB b = new BB();
        b.name = "shtrughn";
        
        Class klass = BB.class;

        Method[] arr = klass.getDeclaredMethods();

        arr[0].invoke(a);
    }    
}

// F:\Java\examples\54_reflection>java W
// Exception in thread "main" java.lang.IllegalAccessException: class W cannot access a member of class BB with modifiers "private"
//         at java.base/jdk.internal.reflect.Reflection.newIllegalAccessException(Reflection.java:392)
//         at java.base/java.lang.reflect.AccessibleObject.checkAccess(AccessibleObject.java:674)
//         at java.base/java.lang.reflect.Method.invoke(Method.java:560)
//         at W.main(W.java:16)