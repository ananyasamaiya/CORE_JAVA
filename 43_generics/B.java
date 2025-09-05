import java.util.ArrayList;

class B {
    public static void main(String[] args) {
        ArrayList<Integer> x = new ArrayList<>();
        x.add(99);
        x.add(98);
        x.add(97);

        ArrayList<Float> y = new ArrayList<>();
        y.add(3.45f);
        y.add(7.89f);
        y.add(5.23f);

        pro(x);
        pro(y);
    }
    static void pro(ArrayList<? extends Number> records){
        // OK
        System.out.println(records.remove(0));

        // NOT OK
        // System.out.println(records.add(78));
        // System.out.println(records.add(7.8f))
    }
}