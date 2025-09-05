import java.util.ArrayList;

class Z {
    public static void main(String[] args) {
        ArrayList<Dog> x = new ArrayList<>();
        ArrayList<Cat> y = new ArrayList<>();
        ArrayList<Cow> z = new ArrayList<>();
        ArrayList<BDog> t = new ArrayList<>();
        ArrayList<Animal> v = new ArrayList<>();

        pro(x);
        pro(y);
        pro(z);
        pro(t);
        pro(v);
    }   
    
    static void pro(ArrayList<? extends Animal> animals) {
        System.out.println(animals);
    }
}