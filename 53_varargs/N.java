class N {
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

        LivingBeing z = new Cat();
        
        pro(cat, dog, cow, bDog, z);
    }
}


// N.java:15: error: method pro in class N cannot be applied to given types;
//         pro(cat, dog, cow, bDog, z);
//         ^
//   required: Animal[]
//   found:    Cat,Dog,Cow,BDog,LivingBeing
//   reason: varargs mismatch; LivingBeing cannot be converted to Animal
// 1 error