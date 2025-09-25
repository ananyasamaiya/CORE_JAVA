import java.lang.annotation.Annotation;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Inherited
@Retention(RetentionPolicy.RUNTIME)
@interface RRR{

}

@RRR
class YY1 {

}

class G1 extends YY1 {
    public static void main(String[] args) {
        Class klass = G1.class;

        Annotation[] arr = klass.getAnnotations();

        for(Annotation next  : arr)
            System.out.println(next);
    }    
}