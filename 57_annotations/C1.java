import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
@interface CC1{

}

@CC1
class C1{
    public static void main(String[] args){
        Class klass = C1.class;

        Annotation[] arr = klass.getAnnotations();

        for(Annotation next : arr){
            System.out.println(next);
        }
    }
}