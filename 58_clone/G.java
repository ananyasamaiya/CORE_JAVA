class Student5 implements Cloneable {
    String name;
    int age;

    Student5(String name, int age) {
        this.name = name;
        this.age = age;
    }

    Object createClone() throws CloneNotSupportedException {
        return this.clone();
    }

    public String toString() {
        return name + " - " + age;
    }
}

class G {
    public static void main(String[] args) {
        Student5 x = new Student5("Yamraj", 10000);

        Student5 y = null;
        try {
            y = (Student5)x.createClone();
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