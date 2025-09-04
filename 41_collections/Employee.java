class Employee implements Comparable<Employee> {
    String name;
    int age;
    
    Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return name + " ~ " + age;
    }

    public int compareTo(Employee obj) {
        return this.name.compareTo(obj.name);
    }
}