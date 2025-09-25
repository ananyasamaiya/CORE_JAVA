import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
@interface A1 {
    
}

@Retention(RetentionPolicy.RUNTIME)
@interface B1 {

}

@Retention(RetentionPolicy.RUNTIME)
@interface D1 {

}

@A1
@B1
@D1
class X1 {

}

class D {
    public static void main(String[] args) {
        Class klass = X1.class;

        Annotation[] arr = klass.getAnnotations();

        for(Annotation next : arr)
            System.out.println(next);
    }    
}