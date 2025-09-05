class M2{
    static <T extends Dog> void aaa(T t){
        System.out.println(t);
    }

    public static void main(String[] args) {
        Cat cat = new Cat();
        Dog dog = new Dog();
        BDog bdog = new BDog();

        // pro(cat);
        // info(dog);

        // aaa(cat);
        aaa(dog);
        aaa(bdog);
    }
}