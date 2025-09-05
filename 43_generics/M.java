class M{
    static void pro(Cat cat){
        System.out.println(cat);
    }

    static void info(Dog dog) {
        System.out.println(dog);
    }

    public static void main(String[] args) {
        Cat cat = new Cat();
        Dog dog = new Dog();

        pro(cat);
        info(dog);
    }
}