import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
@interface EE {
    String[] value();
}

@EE(value={"gopal","prabhat","suman"})
class X {
    public static void main(String[] args) {
        Class<X> klass = X.class;

        EE ano = klass.getAnnotation(EE.class);

        // System.out.println(ano.value());
        String[] arr = ano.value();

        for(String next : arr) {
            System.out.println(next);
        }
    }    
}