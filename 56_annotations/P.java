class P1 {
    @Deprecated
    P1() {

    }
}

class P {
    @Deprecated
    P() {

    }

    public static void main(String[] args) {
        P x = new P();
        P1 y = new P1();        
    }    
}

// Note: P.java uses or overrides a deprecated API.
// Note: Recompile with -Xlint:deprecation for details.