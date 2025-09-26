//address also participle in cloning but address is not cloned both have same 1 address object 

class Address1 {
    String city;
    String state;

    Address1(String city, String state) {
        this.city = city;
        this.state = state;
    }

    // public String toString() {
    //     return city + " - " + state;
    // }
}

class Student9 implements Cloneable {
    String name;
    int age;
    Address1 address;

    Student9(String name, int age, Address1 address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    @Override
    public Student9 clone() {
        Student9 copy = null;

        try {
            copy = (Student9)super.clone();
        } catch(CloneNotSupportedException e) {
            e.printStackTrace();
        }

        return copy;
    }

    // public String toString() {
    //     return name + " - " + age + " - " + address;
    // }
}

class M {
    public static void main(String[] args) {
        Student9 x = new Student9("ritik", 21, new Address1("Jbp", "MP"));

        Student9 y = x.clone();

        System.out.println(x.name + " - " + x.age);
        System.out.println(y.name + " - " + y.age);
        System.out.println(x.address);
        System.out.println(y.address);
        System.out.println(x==y);
    }
}