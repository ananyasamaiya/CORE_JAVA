class DD {
    void process(int y, String z, float x) {
        System.out.println("Hiiiiiiiiiiiiiiiiii");
    }
}

class D extends DD {
    @Override
    void process(int z, float y, String x) {
        System.out.println("Helloooooooooooooo");
    }

    public static void main(String[] args) {
        D x = new D();

        x.process(12,"mohan", 78.89f);
    }
}


// D.java:8: error: method does not override or implement a method from a supertype
//     @Override
//     ^
// 1 error