import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
@interface RR {
    String name() default "yam";
    int age() default 10000;
}

@RR(name="indra")
class W {
    public static void main(String[] args) {
        Class<W> klass = W.class;

        RR ano = klass.getAnnotation(RR.class);

        System.out.println(ano.name());
        System.out.println(ano.age());
    }    
}