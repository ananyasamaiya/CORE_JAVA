class N1 {
    @Deprecated
    static int y = 11;
}

class N {
    @Deprecated
    static int y = 11;
    
    public static void main(String[] args) {
        System.out.println(y); 
        System.out.println(N1.y); 
    }    
}


// Note: N.java uses or overrides a deprecated API.
// Note: Recompile with -Xlint:deprecation for details.