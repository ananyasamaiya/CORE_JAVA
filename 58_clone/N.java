//address also participle in cloning but address is not cloned both have same 1 address object 


class Address2 implements Cloneable{
    String city;
    String state;

    Address2(String city, String state) {
        this.city = city;
        this.state = state;
    }

    public Address2 clone(){
        Address2 copy = null;

        try{
            copy = (Address2)super.clone();
        }catch(CloneNotSupportedException e){
            e.printStackTrace();
        }

        return copy;
    }

    // public String toString() {
    //     return city + " - " + state;
    // }
}

class Student10 implements Cloneable {
    String name;
    int age;
    Address2 address;

    Student10(String name, int age, Address2 address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    @Override
    public Student10 clone() {
        Student10 copy = null;

        try {
            copy = (Student10)super.clone();
        } catch(CloneNotSupportedException e) {
            e.printStackTrace();
        }

        return copy;
    }

    // public String toString() {
    //     return name + " - " + age + " - " + address;
    // }
}

class N{
    public static void main(String[] args) {
        Student10 x = new Student10("ritik", 21, new Address2("Jbp", "MP"));

        Student10 y = x.clone();

        System.out.println(x.name + " - " + x.age);
        System.out.println(y.name + " - " + y.age);
        System.out.println(x.address);
        System.out.println(y.address);
        System.out.println(x==y);
    }
}