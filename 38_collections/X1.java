import java.util.TreeSet;

class X1 {
    public static void main(String[] args) {
        TreeSet<Employee1> set = new TreeSet<Employee1>();

        set.add(new Employee1("om", 12));
        set.add(new Employee1("raj", 8));
        set.add(new Employee1("golu", 14));
        set.add(new Employee1("vivek", 9));
        set.add(new Employee1("ram", 10));

        System.out.println(set);
    }
}


// \examples\38_collections>java X1
// Exception in thread "main" java.lang.ClassCastException: class Employee1 cannot be cast to class java.lang.Comparable (Employee1 is in unnamed module of loader 'app'; java.lang.Comparable is in module java.base of loader 'bootstrap')
//         at java.base/java.util.TreeMap.compare(TreeMap.java:1569)
//         at java.base/java.util.TreeMap.addEntryToEmptyMap(TreeMap.java:776)
//         at java.base/java.util.TreeMap.put(TreeMap.java:785)
//         at java.base/java.util.TreeMap.put(TreeMap.java:534)
//         at java.base/java.util.TreeSet.add(TreeSet.java:255)
//         at X1.main(X1.java:7)