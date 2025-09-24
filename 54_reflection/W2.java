import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class W2 {
    public static void main(String[] args) throws IllegalAccessException, InvocationTargetException {
        BB a = new BB();
        a.name = "bharat";

        BB b = new BB();
        b.name = "shtrughn";
        
        Class klass = BB.class;

        Method[] arr = klass.getDeclaredMethods();

        arr[0].setAccessible(true);

        User user = new User();

        arr[0].invoke(user);
    }    
}

// Exception in thread "main" java.lang.IllegalArgumentException: object is not an instance of declaring class
//         at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
//         at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:77)
//         at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
//         at java.base/java.lang.reflect.Method.invoke(Method.java:568)
//         at W2.main(W2.java:20)