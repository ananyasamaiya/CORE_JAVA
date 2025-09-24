import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;

class B {
    public static void main(String[] args) {
        Class klass = AA.class;

        Constructor[] arr = klass.getDeclaredConstructors();

        for(Constructor next : arr) {
            String mod = Modifier.toString(next.getModifiers());
            
            System.out.println(mod + " " + next.getName());

        }
    }    
}