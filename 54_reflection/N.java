import java.lang.reflect.Field;
import java.util.Date;

class N {
    public static void main(String[] args) throws IllegalAccessException {
        Student2 x = new Student2("jaydrath", 21, 67.45f, new Date(9987788));
        Student2 y = new Student2("jarasandh", 18, 54.23f, new Date(4545454));
               
        Class klass = Student2.class;
        Field[] arr = klass.getDeclaredFields();

        // System.out.println(arr[2].get(x));
        // System.out.println(arr[2].get(y));
        System.out.println(arr[0].get(x));
        System.out.println(arr[0].get(y));
    }
}