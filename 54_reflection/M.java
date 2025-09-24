import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

class M {
    public static void main(String[] args) {
        Class klass = Student2.class;

        Field[] arr = klass.getDeclaredFields();

        for(Field next : arr) {
            String mod = Modifier.toString(next.getModifiers());
            
            String type = next.getType().getName();

            String name = next.getName();
            
            System.out.println(mod + " " + type + " " + name);
        }
    }    
}