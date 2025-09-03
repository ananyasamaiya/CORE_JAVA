import java.util.TreeSet;

class X2 {
    public static void main(String[] args) {
        TreeSet<User> set = new TreeSet<User>();

        set.add(new User("om", 12));
        set.add(new User("raj", 8));
        set.add(new User("golu", 14));
        set.add(new User("vivek", 9));
        set.add(new User("ram", 10));

        System.out.println(set);
    }
}
// Exception in thread "main" java.lang.ClassCastException: class User cannot be cast to class java.lang.Comparable (User is in unnamed module of loader 'app'; java.lang.Comparable is in module java.base of loader 'bootstrap')
//         at java.base/java.util.TreeMap.compare(TreeMap.java:1569)
//         at java.base/java.util.TreeMap.addEntryToEmptyMap(TreeMap.java:776)
//         at java.base/java.util.TreeMap.put(TreeMap.java:785)
//         at java.base/java.util.TreeMap.put(TreeMap.java:534)
//         at java.base/java.util.TreeSet.add(TreeSet.java:255)