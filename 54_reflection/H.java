import java.lang.reflect.Modifier;

class H{
    public static void main(String[] args){
        Class klass = Employee2.class;

        int mod = klass.getModifiers();

        String modifiers = Modifier.toString(mod);

        String name = klass.getName();

        System.out.println(modifiers);
        System.out.println(name);

        Class kl = klass.getSuperclass();

        System.out.println(kl.getName());
    }
}