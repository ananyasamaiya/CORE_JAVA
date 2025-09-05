class N {
    N(Cat cat) {
        System.out.println(cat);
    }

    N(Dog dog) {
        System.out.println(dog);
    }

    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        
        N x = new N(cat);
        N y = new N(dog);
    }    
}