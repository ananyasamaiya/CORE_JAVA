import java.lang.reflect.Constructor;

class Z {
    public static void main(String[] args) {
        Class klass = HH.class;

        Constructor[] arr = klass.getDeclaredConstructors();

        for(Constructor next : arr)
            System.out.println(next); 
            // System.out.println(next.getName()); 
    }    
}