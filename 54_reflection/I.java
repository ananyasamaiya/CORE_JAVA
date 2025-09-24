import java.lang.reflect.Modifier;

class I {
    public static void main(String[] args) {
        Class klass = Employee3.class;

        int mod = klass.getModifiers();

        String modifiers = Modifier.toString(mod);

        String name = klass.getName();

        System.out.println(modifiers);
        System.out.println(name);

        Class kl = klass.getSuperclass();

        System.out.println(kl.getName());

        Class[] arr = klass.getInterfaces();

        for(Class next : arr)
            System.out.println(next.getName());
    }    
}