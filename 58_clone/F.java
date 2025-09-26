class Student4 implements Cloneable {
    String name;
    int age;

    Student4(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args) {
        Student4 x = new Student4("yamraj",1000);

        Student4 y = null;
        try {
            y = (Student4)x.clone();
        } catch(CloneNotSupportedException e) {
            e.printStackTrace();
        }

        System.out.println(x.name + " - " + x.age);
        System.out.println(y.name + " - " + y.age);
        
        y.name = "indra";
        y.age = 32;
        System.out.println("-------------------------");
        
        System.out.println(x.name + " - " + x.age);
        System.out.println(y.name + " - " + y.age);
        System.out.println("-------------------------");
        System.out.println(x == y);
        System.out.println(x);
        System.out.println(y);
    }    
}