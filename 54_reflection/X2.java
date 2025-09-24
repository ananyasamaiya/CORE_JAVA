import java.lang.reflect.Method;
import java.lang.reflect.InvocationTargetException;

class X2 {
    public static void main(String[] args) throws IllegalAccessException, InvocationTargetException {
        DD a = new DD();

        Class klass = DD.class;

        Method[] arr = klass.getDeclaredMethods();

        arr[0].invoke(a);
    }    
}

// Hi
// Exception in thread "main" java.lang.reflect.InvocationTargetException
//         at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
//         at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:77)
//         at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
//         at java.base/java.lang.reflect.Method.invoke(Method.java:568)
//         at X2.main(X2.java:12)
// Caused by: java.lang.ArithmeticException: / by zero
//         at DD.info(DD.java:4)
//         ... 5 more