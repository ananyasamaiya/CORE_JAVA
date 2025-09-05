import java.util.*;

class A2 {
    public static void main(String[] args) {
        ArrayList<HashSet> a = new ArrayList<HashSet>();

        // a.add(12);
        // a.add(1.2);
        // a.add(true);
        a.add(new HashSet<Integer>());
        a.add(new HashSet<String>());
        a.add(new HashSet<Date>());

        System.out.println(a);
    }
}