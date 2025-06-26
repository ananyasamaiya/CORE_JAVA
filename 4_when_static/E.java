<<<<<<< HEAD
// making maxAge static and changing its value
class Student5 {
     String name;
     int age;

     static int maxAge = 20;

    public static void main(String[] args )
    {
        Student5 a = new Student5();
        a.name = "mohan";
        a.age = 14;

        a.maxAge = 50;

        Student5 b = new Student5();
        b.name = "dinesh";
        b.age = 18;

        b.maxAge = 60;

        System.out.println(b.name);  //dinesh
        System.out.println(b.age);   //18
        System.out.println(b.maxAge); //60
        System.out.println(a.name);   //mohan
        System.out.println(a.age);   //14
        System.out.println(a.maxAge); //60



    }
=======
// making maxAge static and changing its value
class Student5 {
     String name;
     int age;

     static int maxAge = 20;

    public static void main(String[] args )
    {
        Student5 a = new Student5();
        a.name = "mohan";
        a.age = 14;

        a.maxAge = 50;

        Student5 b = new Student5();
        b.name = "dinesh";
        b.age = 18;

        b.maxAge = 60;

        System.out.println(b.name);  //dinesh
        System.out.println(b.age);   //18
        System.out.println(b.maxAge); //60
        System.out.println(a.name);   //mohan
        System.out.println(a.age);   //14
        System.out.println(a.maxAge); //60



    }
>>>>>>> 0577215d02043d72dfc9f3b7d836e8da7fb466d6
}