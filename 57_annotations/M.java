import static java.lang.annotation.ElementType.*;
import java.lang.annotation.Target;

@Target({TYPE,METHOD,FIELD,CONSTRUCTOR,LOCAL_VARIABLE})
@interface BCD{

}


@BCD
class M {
    @BCD
    class A {

    }

    @BCD
    enum B {

    }

    @BCD
    interface C {

    }

    @BCD
    int y = 90;        
    
    @BCD
    static int x = 23;
    
    @BCD
    void pro() {

    }
    
    @BCD
    static void info() {
        @BCD
        int w = 9;
    }

    @BCD
    M() {

    }
}