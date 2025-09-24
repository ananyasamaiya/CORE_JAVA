import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

class U {
    static String onlyType(String type) {
        return type.substring(type.lastIndexOf(".")+1);
    }
    
    public static void main(String[] args) {
        Class klass = Student4.class;

        Method[] arr = klass.getDeclaredMethods();

        for(Method next : arr) {
            String methodName = next.getName();
            String methodType = onlyType(next.getReturnType().getName());
            String modifiers = Modifier.toString(next.getModifiers());
            
            Class[] paramTypes = next.getParameterTypes();
            Class[] exceptionTypes = next.getExceptionTypes();

            System.out.print(modifiers + " " + methodType + " " + methodName + "(");

            for(Class nx : paramTypes) {
                System.out.print(onlyType(nx.getName())+", ");
            }

            System.out.print(")" + (exceptionTypes.length !=0 ? " throws " : ""));

            for(Class n : exceptionTypes)
                System.out.print(onlyType(n.getName()) + ", ");
            
            System.out.println();            
        }
    }    
}