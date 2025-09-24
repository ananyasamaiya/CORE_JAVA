import java.lang.reflect.Modifier;
class F1{
    public static void main(String[] args){
        Class klass = Employee1.class;

        int mod = klass.getModifiers();

        System.out.println(Modifier.toString(mod)); 
        System.out.println(klass.getName()); 
    }
}