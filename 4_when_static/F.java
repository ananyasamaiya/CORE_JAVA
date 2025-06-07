// making a method to show info
class Student6 {
    String name;
    int age;

    static int maxAge = 20;

    public static void main (String[] args)
    {
        Student6 a = new Student6();
        a.name  = "golu";
        a.age = 12;

        Student6 b = new Student6();
        b.name  = "bholu";
        b.age = 14;

        b.showInfo();
        a.showInfo();
    }

    void showInfo(){
        System.out.println(name);
        System.out.println(age);
        System.out.println(maxAge);
    }
}