class Y{
    /*static void playSound(Dog x){
        x.makeSound();
    }
    static void playSound(Cat x){
        x.makeSound();
    }
    static void playSound(Cow x){
        x.makeSound();
    }
    */

    static void playSound(Animal x){
        x.makeSound();
    }

    public static void main(String[] args){
        Dog a = new Dog();
        playSound(a);
        System.out.println("~~~~~~~~~~~~~~~~~");
        
        Cat b = new Cat();
        playSound(b);
        System.out.println("~~~~~~~~~~~~~~~~~");
        
        Cow c = new Cow();
        playSound(c);
        System.out.println("~~~~~~~~~~~~~~~~~");
        
    }
}