import java.util.TreeMap;

class R {
    public static void main(String[] args) {
        TreeMap<Employee,Company> map = new TreeMap<Employee,Company>();
        
        map.put(new Employee("mohan", 20), new Company("Global"));
        map.put(new Employee("vikram", 18), new Company("SRIT"));
        map.put(new Employee("sajal", 20), new Company("HEC"));
        map.put(new Employee("ranveer", 19), new Company("JEC"));
        map.put(new Employee("mukesh", 22), new Company("GGITS"));
        map.put(new Employee("suresh", 21), new Company("GGCT"));
        map.put(new Employee("brajesh", 8), new Company("JEC"));
        map.put(new Employee("deepak", 25), new Company("DM"));
        map.put(new Employee("jignesh", 12), new Company("HEC"));
        map.put(new Employee("lav", 15), new Company("Global"));

        System.out.println(map);

        Employee x = new Employee("ekta", 23);
        System.out.println(map.headMap(x));
    }
}