class Student8 implements Cloneable {
    String name;
    int age;

    Student8(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public Student8 clone(){
        Student8 copy = null;

        try {
            copy = (Student8)super.clone();
        } catch(CloneNotSupportedException e) {
            e.printStackTrace();
        }

        return copy;
    }

    public String toString() {
        return name + " - " + age;
    }
}

class J {
    public static void main(String[] args) {
        Student8 x = new Student8("Yamraj", 10000);

        Student8 y = x.clone();

        System.out.println(x);
        System.out.println(y);

        y.name = "Indra";
        y.age = 32;
        System.out.println("-----------------");
        System.out.println(x);
        System.out.println(y);
    }
}