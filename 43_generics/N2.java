class N2{
    // N(Cat cat) {
    //     System.out.println(cat);
    // }

    // N(Dog dog) {
    //     System.out.println(dog);
    // }
    <T extends Dog> N2(T t){
        System.out.println(t);
    }

    public static void main(String[] args) {
        Dog dog = new Dog();
        GRDog grdog = new GRDog();
        Cat cat = new Cat();
        
        // N2 x = new N2(cat);
        N2 y = new N2(dog);
        N2 z = new N2(grdog);
    }    
}