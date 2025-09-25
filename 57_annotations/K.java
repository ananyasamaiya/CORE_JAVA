import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Target({ElementType.TYPE,ElementType.METHOD})
@interface PQR {

}


@PQR
class K {
    @PQR
    class A {

    }

    @PQR
    enum B {

    }

    @PQR
    interface C {

    }
/*
    @PQR
    int y = 90;        
    
    @PQR
    static int x = 23;
*/    
    @PQR
    void pro() {

    }
    
    @PQR
    static void info() {
        // @PQR
        int w = 9;
    }

    // @PQR
    // K() {

    // }
}