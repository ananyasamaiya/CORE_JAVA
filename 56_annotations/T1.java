class T1 {
    @Deprecated
    class A {

    }   
    
    @Deprecated
    interface B {

    }

    @Deprecated
    enum C {

    }
}

class T {
    public static void main(String[] args) {
        @SuppressWarnings("deprecation")
        T1.A x;
    }
}