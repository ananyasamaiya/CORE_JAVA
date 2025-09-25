import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Target({ElementType.TYPE,ElementType.METHOD,ElementType.FIELD})
@interface KLM {

}


@KLM
class L {
    @KLM
    class A {

    }

    @KLM
    enum B {

    }

    @KLM
    interface C {

    }

    @KLM
    int y = 90;        
    
    @KLM
    static int x = 23;
    
    @KLM
    void pro() {

    }
    
    @KLM
    static void info() {
        // @KLM
        int w = 9;
    }

    // @KLM
    // L() {

    // }
}