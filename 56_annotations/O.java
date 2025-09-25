class O1 {
    @Deprecated
    static void info() {
        System.out.println("Hello");
    }
}

class O {
    @Deprecated
    static void pro() {
        System.out.println("Hi");
    }    

    public static void main(String[] args) {
        pro();

        O1.info();
    }
}

// Note: O.java uses or overrides a deprecated API.
// Note: Recompile with -Xlint:deprecation for details.