import java.lang.reflect.Method;

class Q {
    public static void main(String[] args) {
        Class klass = Employee4.class;

        Method[] arr = klass.getDeclaredMethods();

        for(Method next : arr) {
            String methodName = next.getName();
            String methodType = next.getReturnType().getName();
            System.out.println(methodType + " " + methodName);
        }
    }    
}