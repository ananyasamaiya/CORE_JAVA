//get nothing printed 

import java.lang.annotation.Annotation;

@interface CC{

}

@CC
class C{
    public static void main(String[] args){
        Class klass = C.class;

        Annotation[] arr = klass.getAnnotations();

        for(Annotation next : arr){
            System.out.println(next);
        }
    } 
}