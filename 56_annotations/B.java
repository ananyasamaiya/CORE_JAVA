class BB {
    void process() {
        System.out.println("Hi");
    }
}

class B extends BB {
    @Override
    void pracess() {
        System.out.println("Hello");
    }

    public static void main(String[] args) {
        B x = new B();
        x.process();
    }
}


// B.java:8: error: method does not override or implement a method from a supertype
//     @Override
//     ^
// 1 error