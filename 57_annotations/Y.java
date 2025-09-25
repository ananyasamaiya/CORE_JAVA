import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
@interface FF {
    String[] value();
}

@FF({"balbhadra","sudama","tarka"})
class Y {
    public static void main(String[] args) {
        Class<Y> klass = Y.class;

        FF ano = klass.getAnnotation(FF.class);

        // System.out.println(ano.value());
        String[] arr = ano.value();

        for(String next : arr) {
            System.out.println(next);
        }
    }    
}