interface AA {
    // void pro();
    void info();
}

class P {
    public static void main(String[] args) {
        AA x = () -> System.out.println("Hello");

        // x.pro();
        x.info();
    }    
}