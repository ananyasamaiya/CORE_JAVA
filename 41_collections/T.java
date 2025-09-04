import java.util.TreeMap;

class T {
    public static void main(String[] args) {
        AgeDscSort m = new AgeDscSort();
        // NameDscSort m = new NameDscSort();

        TreeMap<Student,College> map = new TreeMap<Student,College>(m);
        
        map.put(new Student("mohan", 20), new College("Global"));
        map.put(new Student("vikram", 18), new College("SRIT"));
        map.put(new Student("sajal", 13), new College("HEC"));
        map.put(new Student("ranveer", 19), new College("JEC"));
        map.put(new Student("mukesh", 22), new College("GGITS"));
        map.put(new Student("suresh", 21), new College("GGCT"));
        map.put(new Student("brajesh", 8), new College("JEC"));
        map.put(new Student("deepak", 25), new College("DM"));
        map.put(new Student("jignesh", 12), new College("HEC"));
        map.put(new Student("lav", 15), new College("Global"));

        System.out.println(map);

        Student x = new Student("nitin", 14);
        System.out.println(map.tailMap(x));
    }
}