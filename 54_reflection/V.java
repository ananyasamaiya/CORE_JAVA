import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class V {
    public static void main(String[] args) throws IllegalAccessException, InvocationTargetException {
        AA a = new AA();
        a.name = "yamraj";

        AA b = new AA();
        b.name = "indra";
        
        Class klass = AA.class;

        Method[] arr = klass.getDeclaredMethods();

        arr[0].invoke(a);
    }    
}