// making maxAge static
class Student4 {
     String name;
     int age;

     static int maxAge = 20;

    public static void main(String[] args )
    {
        Student4 a = new Student4();
        a.name = "mohan";
        a.age = 14;

        Student4 b = new Student4();
        b.name = "dinesh";
        b.age = 18;

        System.out.println(b.name);  //dinesh
        System.out.println(b.age);   //18
        System.out.println(b.maxAge); //20
        System.out.println(a.name);   //mohan
        System.out.println(a.age);   //14
        System.out.println(a.maxAge); //20



    }
}