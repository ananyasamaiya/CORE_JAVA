//address also praticiple in cloning but address is not cloned both have same 1 address object 
class Address {
    String city;
    String state;

    Address(String city, String state) {
        this.city = city;
        this.state = state;
    }

    public String toString() {
        return city + " - " + state;
    }
}

class Student8 implements Cloneable {
    String name;
    int age;
    Address address;

    Student8(String name, int age, Address address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    @Override
    public Student8 clone() {
        Student8 copy = null;

        try {
            copy = (Student8)super.clone();
        } catch(CloneNotSupportedException e) {
            e.printStackTrace();
        }

        return copy;
    }

    public String toString() {
        return name + " - " + age + " - " + address;
    }
}

class L {
    public static void main(String[] args) {
        Student8 x = new Student8("ritik", 21, new Address("Jbp", "MP"));

        Student8 y = x.clone();

        System.out.println(x);
        System.out.println(y);
        System.out.println(x==y);
    }
}