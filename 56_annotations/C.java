class CC {
    void process(int y, String z, float x) {
        System.out.println("Hiiiiiiiiiiiiiiiiii");
    }
}

class C extends CC {
    void process(int z, float y, String x) {
        System.out.println("Helloooooooooooooo");
    }

    public static void main(String[] args) {
        C x = new C();

        x.process(12,"mohan", 78.89f);
    }
}