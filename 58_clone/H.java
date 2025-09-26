class Student6 implements Cloneable {
    String name;
    int age;

    Student6(String name, int age) {
        this.name = name;
        this.age = age;
    }

    Student6 createClone() throws CloneNotSupportedException {
        return (Student6)this.clone();
    }

    public String toString() {
        return name + " - " + age;
    }
}

class H {
    public static void main(String[] args) {
        Student6 x = new Student6("Yamraj", 10000);

        Student6 y = null;
        try {
            y = x.createClone();
        } catch(CloneNotSupportedException e) {
            e.printStackTrace();
        }

        System.out.println(x);
        System.out.println(y);

        y.name = "Indra";
        y.age = 32;
        System.out.println("-----------------");
        System.out.println(x);
        System.out.println(y);
    }
}