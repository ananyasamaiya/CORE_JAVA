import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

class R {
    public static void main(String[] args) {
        Class klass = Employee4.class;

        Method[] arr = klass.getDeclaredMethods();

        for(Method next : arr) {
            String methodName = next.getName();
            String methodType = next.getReturnType().getName();
            String modifiers = Modifier.toString(next.getModifiers());
            System.out.println(modifiers + " " + methodType + " " + methodName);
        }
    }    
}