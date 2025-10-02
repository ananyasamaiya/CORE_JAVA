class D1{
    // static void bark(Animal a){
    //     System.out.println("bark ~ Animal");
    // }
    static void bark(Dog a){
        System.out.println("bark ~ Dog");
    }
    static void bark(Cat a){
        System.out.println("bark ~ Cat");
    }

    // static void bark(BDog a){
    //     System.out.println("bark ~ BDog");
    // }
    public static void main(String[] args){
        bark(null);
    }
}

class Animal{ }
class Dog extends Animal { }
class Cat extends Animal { }
class BDog extends Dog { }