class O {
    public static void main(String[] args) {
        Dog dog = new Dog();
        GRDog grdog = new GRDog();
        Cat cat = new Cat();

        pro(dog, cat);
        pro(dog, grdog);
        pro(cat, grdog);
    }   
    
    static <X,Y> void pro(X x, Y y) {
        System.out.println(x);
        System.out.println(y);
    }
}