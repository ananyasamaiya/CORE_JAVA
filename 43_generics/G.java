import java.util.ArrayList;

class G {
    public static void main(String[] args) {
        ArrayList<? super Dog> x1 = new ArrayList<Dog>();
        ArrayList<? super Dog> x2 = new ArrayList<Animal>();
        ArrayList<? super Dog> x3 = new ArrayList<LivingBeing>();
        ArrayList<? super Dog> x4 = new ArrayList<Object>();

        // x1.add(new Object());
        // x1.add(new LivingBeing());
        // x1.add(new Animal());
        // x1.add(new Cat());
        // x1.add(new Dog());   // OK
        // x1.add(new BDog());  // OK
        
        // x2.add(new Object());
        // x2.add(new LivingBeing());
        // x2.add(new Animal());
        // x2.add(new Cat());
        // x2.add(new Dog());   // OK
        // x2.add(new BDog());  // OK
        
        // x3.add(new Object());
        // x3.add(new LivingBeing());
        // x3.add(new Animal());
        // x3.add(new Cat());
        // x3.add(new Dog());  // OK 
        // x3.add(new BDog()); // OK
        
        // x4.add(new Object());
        // x4.add(new LivingBeing());
        // x4.add(new Animal());
        // x4.add(new Cat());
        // x4.add(new Dog());  // OK
        // x4.add(new BDog()); // OK
        
    }    
}