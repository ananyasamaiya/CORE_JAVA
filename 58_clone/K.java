//if parent is not mark Cloneable it will still take part in Cloning 
class User {
    String name;
    int age;

    User(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

class Employee extends User implements Cloneable {
    String designation;
    float salary;

    Employee(String name, int age, String designation, float salary) {
        super(name, age);
        this.designation = designation;
        this.salary = salary;
    }

    public Employee clone() {
        Employee copy = null;

        try {
            copy = (Employee)super.clone();
        } catch(CloneNotSupportedException e) {
            e.printStackTrace();
        } 

        return copy;
    }

    public String toString() {
        return name + " - " + age + " - " + designation + " - " + salary;
    }
}

class K {
    public static void main(String[] args) {
        Employee e = new Employee("yamraj", 10000, "malik", 1200000000);

        Employee b = e.clone();
        
        System.out.println(e);
        System.out.println(b);
        System.out.println(e==b);
    }
}