import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

class S {
    public static void main(String[] args) {
        Class klass = Student3.class;

        Method[] arr = klass.getDeclaredMethods();

        for(Method next : arr) {
            String methodName = next.getName();
            String methodType = next.getReturnType().getName();
            String modifiers = Modifier.toString(next.getModifiers());
            
            Class[] paramTypes = next.getParameterTypes();

            System.out.print(modifiers + " " + methodType + " " + methodName + "(");

            for(Class nx : paramTypes) {
                System.out.print(nx.getName()+", ");
            }

            System.out.println(")");
        }
    }    
}