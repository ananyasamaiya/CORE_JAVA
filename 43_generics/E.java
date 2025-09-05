import java.util.ArrayList;

class E {
    public static void main(String[] args) {
        pro(new ArrayList<Dog>());
        pro(new ArrayList<Animal>());
        pro(new ArrayList<LivingBeing>());
        pro(new ArrayList<Object>());
        // ---------------------------------------
        info(new ArrayList<Dog>());
        info(new ArrayList<BDog>());
        info(new ArrayList<HDog>());
        info(new ArrayList<GRDog>());
    }   
    
    static void info(ArrayList<? extends Dog> list) {
        System.out.println(list);
    }
    
    static void pro(ArrayList<? super Dog> list) {
        System.out.println(list);
    }
}