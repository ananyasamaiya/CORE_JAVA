import java.lang.reflect.Method;

class O{
    public static void main(String[] args){
        Class klass = Employee4.class;

        Method[] arr = klass.getMethods();

        for(Method next : arr){
            System.out.println(next.getName());
        }
    }
}