import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class X1 {
    public static void main(String[] args) throws IllegalAccessException, InvocationTargetException {
        CC a = new CC();
        a.name = "bharat";
        
        Class klass = CC.class;

        Method[] arr = klass.getDeclaredMethods();

        arr[0].setAccessible(true);

        arr[0].invoke(a, 44, "jagdeep");
    }    
}