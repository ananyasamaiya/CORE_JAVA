class X{
    static void playSound(Dog x){
        x.makeSound();
    }
    static void playSound(Cat x){
        x.makeSound();
    }
    static void playSound(Cow x){
        x.makeSound();
    }

    public static void main(String[] args){
        Dog a = new Dog();
        playSound(a);
        
        Cat b = new Cat();
        playSound(b);

        Cow c = new Cow();
        playSound(c);

    }
}