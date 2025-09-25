import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
@interface II {
    String name() default "yam";
    int age() default 10000;
}

@II
class V {
    public static void main(String[] args) {
        Class<V> klass = V.class;

        II ano = klass.getAnnotation(II.class);

        System.out.println(ano.name());
        System.out.println(ano.age());
    }    
}