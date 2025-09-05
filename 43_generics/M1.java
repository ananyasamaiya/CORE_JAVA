class M1{
    // static void pro(Cat cat){
    //     System.out.println(cat);
    // }

    // static void info(Dog dog) {
    //     System.out.println(dog);
    // }
    static <T> void aaa(T t){
        System.out.println(t);
    }

    public static void main(String[] args) {
        Cat cat = new Cat();
        Dog dog = new Dog();
        Car dog = new Car();

        // pro(cat);
        // info(dog);

        aaa(cat);
        aaa(dog);
        aaa(car);
    }
}