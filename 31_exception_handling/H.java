class H{
    public static void main(String[] args){
        System.out.println("start");

        Animal a = new Cat();

        try{
            Dog x = (Dog)a;
        }catch(ClassCastException e){
            System.out.println(e);
        }



        System.out.println("end");
    }
}

class Animal{}
class Dog extends Animal{}
class Cat extends Animal{}