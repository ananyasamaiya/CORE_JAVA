import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
@interface YY {
    String name();
    int age();
}

@YY(name="chotabheem",age=9)
class T {
    public static void main(String[] args) {
        Class<T> klass = T.class;

        YY ano = klass.getAnnotation(YY.class);

        // System.out.println(ano instanceof Object);

        System.out.println(ano.name());
        System.out.println(ano.age());
    }    
}