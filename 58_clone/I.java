class Student7 implements Cloneable {
    String name;
    int age;

    Student7(String name, int age) {
        this.name = name;
        this.age = age;
    }

    Student7 createClone() {
        Student7 copy = null;

        try {
            copy = (Student7)this.clone();
        } catch(CloneNotSupportedException e) {
            e.printStackTrace();
        }

        return copy;
    }

    public String toString() {
        return name + " - " + age;
    }
}

class I {
    public static void main(String[] args) {
        Student7 x = new Student7("Yamraj", 10000);

        Student7 y = x.createClone();

        System.out.println(x);
        System.out.println(y);

        y.name = "Indra";
        y.age = 32;
        System.out.println("-----------------");
        System.out.println(x);
        System.out.println(y);
    }
}