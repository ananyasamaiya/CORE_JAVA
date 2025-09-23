enum CoffeeMugSize{
    SMALL(200), MEDIUM(500), LARGE(700);
    private int size;

    CoffeeMugSize(int size){
        this.size = size;
    }

    public int getSize(){
        return size;
    }
}

class Q {
    public static void main(String[] args) {
        CoffeeMugSize w = CoffeeMugSize.LARGE;

        System.out.println(w);
        System.out.println(w.getSize());
    }    
}