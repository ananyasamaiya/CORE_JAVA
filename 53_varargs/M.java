class M {
    static void pro(Animal... x) {
        for(Animal next : x) {
            System.out.println(next);
        }
    }
    public static void main(String[] args) {
        Cat cat = new Cat();
        Dog dog = new Dog();
        Cow cow = new Cow();

        BDog bDog = new BDog();
        
        pro(cat, dog, cow, bDog);
    }
}