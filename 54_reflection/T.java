import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

class T {
    public static void main(String[] args) {
        Class klass = Student4.class;

        Method[] arr = klass.getDeclaredMethods();

        for(Method next : arr) {
            String methodName = next.getName();
            String methodType = next.getReturnType().getName();
            String modifiers = Modifier.toString(next.getModifiers());
            
            Class[] paramTypes = next.getParameterTypes();
            Class[] exceptionTypes = next.getExceptionTypes();

            System.out.print(modifiers + " " + methodType + " " + methodName + "(");

            for(Class nx : paramTypes) {
                System.out.print(nx.getName()+", ");
            }

            System.out.print(")" + (exceptionTypes.length !=0 ? " throws " : ""));

            for(Class n : exceptionTypes)
                System.out.print(n.getName() + ", ");
            
            System.out.println();            
        }
    }    
}