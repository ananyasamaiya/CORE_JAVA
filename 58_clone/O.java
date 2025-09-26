class Address3 implements Cloneable {
    String city;
    String state;

    Address3(String city, String state) {
        this.city = city;
        this.state = state;
    }

    public Address3 clone() {
        Address3 copy = null;

        try {
            copy = (Address3)super.clone();
        } catch(CloneNotSupportedException e) {
            e.printStackTrace();
        }

        return copy;
    }

    // public String toString() {
    //     return city + " - " + state;
    // }
}

class Student11 implements Cloneable {
    String name;
    int age;
    Address3 address;

    Student11(String name, int age, Address3 address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    @Override
    public Student11 clone() {
        Student11 copy = null;

        try {
            copy = (Student11)super.clone();
        } catch(CloneNotSupportedException e) {
            e.printStackTrace();
        }

        copy.address = address.clone();

        return copy;
    }

    // public String toString() {
    //     return name + " - " + age + " - " + address;
    // }
}

class O {
    public static void main(String[] args) {
        Student11 x = new Student11("ritik", 21, new Address3("Jbp", "MP"));

        Student11 y = x.clone();

        System.out.println(x.name + " - " + x.age);
        System.out.println(y.name + " - " + y.age);
        System.out.println(x.address);
        System.out.println(y.address);
        System.out.println(x==y);
    }
}