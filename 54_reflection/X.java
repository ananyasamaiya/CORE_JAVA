import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class X {
    public static void main(String[] args) throws IllegalAccessException, InvocationTargetException {
        CC a = new CC();
        a.name = "bharat";
        
        Class klass = CC.class;

        Method[] arr = klass.getDeclaredMethods();

        arr[0].setAccessible(true);

        arr[0].invoke(a);
    }    
}

// Exception in thread "main" java.lang.IllegalArgumentException: wrong number of arguments
//         at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
//         at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:77)
//         at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
//         at java.base/java.lang.reflect.Method.invoke(Method.java:568)
//         at X.main(X.java:15)