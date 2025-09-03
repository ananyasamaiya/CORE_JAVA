import java.util.TreeSet;

class X {
    public static void main(String[] args) {
        TreeSet<Student> set = new TreeSet<Student>();

        set.add(new Student("om", 12));
        set.add(new Student("raj", 8));
        set.add(new Student("golu", 14));
        set.add(new Student("vivek", 9));
        set.add(new Student("ram", 10));

        System.out.println(set);
    }
}
// Exception in thread "main" java.lang.ClassCastException: class Student cannot be cast to class java.lang.Comparable (Student is in unnamed module of loader 'app'; java.lang.Comparable is in module java.base of loader 'bootstrap')
//         at java.base/java.util.TreeMap.compare(TreeMap.java:1569)
//         at java.base/java.util.TreeMap.addEntryToEmptyMap(TreeMap.java:776)
//         at java.base/java.util.TreeMap.put(TreeMap.java:785)
//         at java.base/java.util.TreeMap.put(TreeMap.java:534)
//         at java.base/java.util.TreeSet.add(TreeSet.java:255)
//         at X.main(X.java:7)