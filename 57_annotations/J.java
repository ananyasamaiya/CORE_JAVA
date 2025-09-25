import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)
@interface IJK {

}


@IJK
class J {
    @IJK
    class A {

    }

    @IJK
    enum B {

    }

    @IJK
    interface C {

    }
/*
    @IJK
    int y = 90;        
    

    @IJK
    static int x = 23;
    
    @IJK
    void pro() {

    }
    
    @IJK
    static void info() {
        @IJK
        int w = 9;
    }
    @IJK
    J() {

    }
*/
}