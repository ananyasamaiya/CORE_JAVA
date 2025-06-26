<<<<<<< HEAD
// making maxAge non static
class Student3 {
     String name;
     int age;

     int maxAge = 20;

    public static void main(String[] args )
    {
        Student3 a = new Student3();
        a.name = "mohan";
        a.age = 14;
        //a.maxAge = 20;

        Student3 b = new Student3();
        b.name = "dinesh";
        b.age = 18;
        //b.maxAge = 20;

        System.out.println(b.name);  //dinesh
        System.out.println(b.age);   //18
        System.out.println(b.maxAge); //20
        System.out.println(a.name);   //mohan
        System.out.println(a.age);   //14
        System.out.println(a.maxAge); //20



    }
=======
// making maxAge non static
class Student3 {
     String name;
     int age;

     int maxAge = 20;

    public static void main(String[] args )
    {
        Student3 a = new Student3();
        a.name = "mohan";
        a.age = 14;
        //a.maxAge = 20;

        Student3 b = new Student3();
        b.name = "dinesh";
        b.age = 18;
        //b.maxAge = 20;

        System.out.println(b.name);  //dinesh
        System.out.println(b.age);   //18
        System.out.println(b.maxAge); //20
        System.out.println(a.name);   //mohan
        System.out.println(a.age);   //14
        System.out.println(a.maxAge); //20



    }
>>>>>>> 0577215d02043d72dfc9f3b7d836e8da7fb466d6
}