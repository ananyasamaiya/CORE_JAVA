enum CoffeeMugSize {
    SMALL(200), MEDIUM(500), LARGE(700);

    private int size;

    CoffeeMugSize(int size) {
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    // public String toString() {
    //     return this + " - " + size;
    // }
    public String stringify() {
        return this + " - " + size;
    }
}

class R {
    public static void main(String[] args) {
        CoffeeMugSize w = CoffeeMugSize.SMALL;

        System.out.println(w);
        System.out.println(w.toString());
        System.out.println(w.stringify());
        System.out.println(w.getSize());
    }    
}
