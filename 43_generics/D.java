import java.util.ArrayList;

class D{
    public static void main(String[] args){
        ArrayList<? super Dog> x1 = new ArrayList<Dog>();
        ArrayList<? super Dog> x2 = new ArrayList<Animal>();
        ArrayList<? super Dog> x3 = new ArrayList<LivingBeing>();
        ArrayList<? super Dog> x4 = new ArrayList<Object>();
        // ---------------------------------------
        ArrayList<? extends Dog> x5 = new ArrayList<Dog>();
        ArrayList<? extends Dog> x6 = new ArrayList<BDog>();
        ArrayList<? extends Dog> x7 = new ArrayList<HDog>();
        ArrayList<? extends Dog> x8 = new ArrayList<GRDog>();
    }
}