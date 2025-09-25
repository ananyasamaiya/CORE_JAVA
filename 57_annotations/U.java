import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
@interface KK {
    String name();
    int age();
}

@KK
class U {
    public static void main(String[] args) {
        Class<U> klass = U.class;

        KK ano = klass.getAnnotation(KK.class);

        System.out.println(ano.name());
        System.out.println(ano.age());
    }    
}


// U.java:6: error: annotation @KK is missing default values for elements name,age
// @KK
// ^
// 1 error