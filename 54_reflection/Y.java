import java.lang.reflect.Constructor;

class Y {
    public static void main(String[] args) {
        Class klass = HH.class;

        Constructor[] arr = klass.getConstructors();

        for(Constructor next : arr)
            System.out.println(next); 
            // System.out.println(next.getName()); 
    }    
}