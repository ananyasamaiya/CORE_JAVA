import java.lang.annotation.Annotation;

@interface UU{
    String name();
    int age();
}

@UU(name="ajay",age=7)
class S{
    public static void main(String[] args){
        Class<S> klass = S.class;

        // Annotation ano = klass.getAnnotation(UU.class);
        
        UU ano = klass.getAnnotation(UU.class);
        // System.out.println(ano instanceof Ob ject);

        System.out.println(ano.name());
        System.out.println(ano.age());
    
    
    }
}

// Exception in thread "main" java.lang.NullPointerException: Cannot invoke "UU.name()" because "<local2>" is null
//         at S.main(S.java:18)