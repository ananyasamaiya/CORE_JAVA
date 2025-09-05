class N1{
    // N(Cat cat) {
    //     System.out.println(cat);
    // }

    // N(Dog dog) {
    //     System.out.println(dog);
    // }
    <T> N1(T t){
        System.out.println(t);
    }

    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        
        N1 x = new N1(cat);
        N1 y = new N1(dog);
    }    
}