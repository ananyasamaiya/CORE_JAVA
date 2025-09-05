import java.util.*;

class A5 {
    public static void main(String[] args) {
        
        TreeMap<String,Integer> x = new TreeMap<>();
        x.put("mohan", 12);
        x.put("sohan", 9);
        x.put("rohan", 17);
        
        TreeMap<String,Integer> y = new TreeMap<>();
        y.put("dinesh", 21);
        y.put("suresh", 18);
        y.put("mahesh", 15);
        
        TreeMap<String,Integer> z = new TreeMap<>();
        z.put("om", 8);
        z.put("ram", 5);
        z.put("raju", 3);
        
        TreeMap<Float,Boolean> t = new TreeMap<>();
        t.put(2.3f, true);
        HashSet<TreeMap<Float,Boolean>> w = new HashSet<>();
        w.add(t);
        
        HashSet<TreeMap<String,Integer>> u = new HashSet<>();
        u.add(x);
        u.add(y);
        
        HashSet<TreeMap<String,Integer>> v = new HashSet<>();
        v.add(z);
        
        ArrayList<HashSet<TreeMap<String,Integer>>> a = new ArrayList<HashSet<TreeMap<String,Integer>>>();
        a.add(u);
        a.add(v);
        // a.add(w);

        System.out.println(a);
    }
}



// A5.java:36: error: incompatible types: HashSet<TreeMap<Float,Boolean>> cannot be converted to HashSet<TreeMap<String,Integer>>
//         a.add(w);
//               ^
// Note: Some messages have been simplified; recompile with -Xdiags:verbose to get full output
// 1 error