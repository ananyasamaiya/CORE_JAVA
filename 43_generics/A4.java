import java.util.*;

class A4 {
    public static void main(String[] args) {
        ArrayList<HashSet<TreeMap>> a = new ArrayList<HashSet<TreeMap>>();

        // a.add(12);
        // a.add(1.2);
        // a.add(true);
        // a.add(new HashSet<Integer>());
        // a.add(new HashSet<String>());
        // a.add(new HashSet<Date>());
        a.add(new HashSet<TreeMap>());
        a.add(new HashSet<TreeMap>());
        a.add(new HashSet<TreeMap>());

        System.out.println(a);
    }
}