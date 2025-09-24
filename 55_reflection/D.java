import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;

class D {
    static String onlyType(String type) {
        return type.substring(type.lastIndexOf(".")+1);
    }

    public static void main(String[] args) {
        Class klass = AA.class;

        Constructor[] arr = klass.getDeclaredConstructors();

        for(Constructor next : arr) {
            String mod = Modifier.toString(next.getModifiers());
            
            System.out.print(mod + " " + next.getName() + "(");

            Class[] ar = next.getParameterTypes();
            for(Class k : ar)
                System.out.print(onlyType(k.getName())+", ");

            System.out.print(")");

            Class[] r = next.getExceptionTypes();
            if(r.length != 0) {
                System.out.print(" throws ");
                for(Class n : r)
                    System.out.print(onlyType(n.getName()) + ", ");
            }

            System.out.println();
        }
    }    
}