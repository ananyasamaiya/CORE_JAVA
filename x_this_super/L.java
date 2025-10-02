class User{
    String name;
    int age;

    User(String name, int age){
        this.name = name;
        this.age = age;
    }
}

class Student extends User{
    String college;
    String degree;
    String semester;

    Student(String name, int age, String college, String degree, String semester){
        super(name, age);
        this.college = college;
        this.degree = degree;
        this.semester = semester;
    }
}
class L{
    public static void main(String[] args){
        Student x = new Student("ram", 26, "JEC", "BTech", "3rd");

        System.out.println(x.name);
        System.out.println(x.age);
        System.out.println(x.college);
        System.out.println(x.degree);
        System.out.println(x.semester);
    }
}