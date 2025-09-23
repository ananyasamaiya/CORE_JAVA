enum CoffeeMugSize {
    SMALL(200,"S"), MEDIUM(500,"M"), LARGE(700,"L");

    private int size;
    private String label;

    CoffeeMugSize(int size, String label) {

        this.size = size;
        this.label = label;
    }

    public int getSize() {
        return size;
    }

    public String getLabel() {
        return label;
    }
}

class S {
    public static void main(String[] args) {
        CoffeeMugSize w = CoffeeMugSize.SMALL;

        System.out.println(w);
        System.out.println(w.getLabel());
        System.out.println(w.getSize());
    }    
}