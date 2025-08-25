class F1{
    public static void main(String[] args){
        LivingBeing t = new LivingBeing();
        Animal[] arr = {new Animal(), new Dog(),new Cat(),new Cow(),new BDog(), (Animal)t};

        for(Animal next : arr)
            System.out.println(next);
    }
}
// Exception in thread "main" java.lang.ClassCastException: class LivingBeing cannot be cast to class Animal (LivingBeing and Animal are in unnamed module of loader 'app')
//         at F1.main(F1.java:4)
