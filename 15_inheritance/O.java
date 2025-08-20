class LivingBeing{}

class Plant extends LivingBeing{}

class Animal extends LivingBeing{}

class Human extends LivingBeing{}

class Cat extends Animal{}
class Dog extends Animal{}
class Cow extends Animal{}

class BDog extends Dog{}

class O{
    public static void main(String[] args){
        BDog x = new BDog();

        System.out.println(x instanceof BDog);
        System.out.println(x instanceof Dog);
        System.out.println(x instanceof Animal);
        System.out.println(x instanceof LivingBeing);
        System.out.println(x instanceof Object);


        System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
        System.out.println(x instanceof Cat);
        System.out.println(x instanceof Cow);
        System.out.println(x instanceof Plant);
        System.out.println(x instanceof Human);
    }
}

// O.java:27: error: incompatible types: BDog cannot be converted to Cat
//         System.out.println(x instanceof Cat);
//                            ^
// O.java:28: error: incompatible types: BDog cannot be converted to Cow
//         System.out.println(x instanceof Cow);
//                            ^
// O.java:29: error: incompatible types: BDog cannot be converted to Plant
//         System.out.println(x instanceof Plant);
//                            ^
// O.java:30: error: incompatible types: BDog cannot be converted to Human
//         System.out.println(x instanceof Human);
//                            ^
// 4 errors
