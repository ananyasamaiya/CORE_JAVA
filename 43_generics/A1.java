import java.util.*;

class A1 {
    public static void main(String[] args) {
        ArrayList<HashSet> a = new ArrayList<HashSet>();

        // a.add(12);
        // a.add(1.2);
        // a.add(true);
        a.add(new HashSet());
        a.add(new HashSet());
        a.add(new HashSet());

        System.out.println(a);
    }
}