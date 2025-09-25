//can't see output
import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
@interface AAA {

}

@AAA
class Y1 {

}

class G extends Y1 {
    public static void main(String[] args) {
        Class klass = G.class;

        Annotation[] arr = klass.getAnnotations();

        for(Annotation next  : arr)
            System.out.println(next);
    }    
}