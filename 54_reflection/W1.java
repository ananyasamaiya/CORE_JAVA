import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class W1 {
    public static void main(String[] args) throws IllegalAccessException, InvocationTargetException {
        BB a = new BB();
        a.name = "bharat";

        BB b = new BB();
        b.name = "shtrughn";
        
        Class klass = BB.class;

        Method[] arr = klass.getDeclaredMethods();

        arr[0].setAccessible(true);

        arr[0].invoke(b);
    }    
}