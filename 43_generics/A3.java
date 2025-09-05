import java.util.*;

class A3 {
    public static void main(String[] args) {
        ArrayList<HashSet<TreeMap>> a = new ArrayList<HashSet<TreeMap>>();

        // a.add(12);
        // a.add(1.2);
        // a.add(true);
        a.add(new HashSet<Integer>());
        a.add(new HashSet<String>());
        a.add(new HashSet<Date>());

        System.out.println(a);
    }
}


// A3.java:10: error: incompatible types: HashSet<Integer> cannot be converted to HashSet<TreeMap>
//         a.add(new HashSet<Integer>());
//               ^
// A3.java:11: error: incompatible types: HashSet<String> cannot be converted to HashSet<TreeMap>
//         a.add(new HashSet<String>());
//               ^
// A3.java:12: error: incompatible types: HashSet<Date> cannot be converted to HashSet<TreeMap>
//         a.add(new HashSet<Date>());
//               ^
// Note: Some messages have been simplified; recompile with -Xdiags:verbose to get full output
// 3 errors