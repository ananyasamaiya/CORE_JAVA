<<<<<<< HEAD
// non static variable and multiple object

class Student2 {
     String name;
     int age;

    public static void main(String[] args )
    {
        Student2 a = new Student2();
        a.name = "mohan";
        a.age = 14;

        Student2 b = new Student2();
        b.name = "dinesh";
        b.age = 18;

        Student2 c = new Student2();
        c.name = "om";
        c.age = 9;

        System.out.println(b.name);  //dinesh
        System.out.println(b.age);   //18
        System.out.println(a.name);   //mohan
        System.out.println(a.age);   //14
        System.out.println(c.name);  //om
        System.out.println(c.age);   //9



    }
=======
// non static variable and multiple object

class Student2 {
     String name;
     int age;

    public static void main(String[] args )
    {
        Student2 a = new Student2();
        a.name = "mohan";
        a.age = 14;

        Student2 b = new Student2();
        b.name = "dinesh";
        b.age = 18;

        Student2 c = new Student2();
        c.name = "om";
        c.age = 9;

        System.out.println(b.name);  //dinesh
        System.out.println(b.age);   //18
        System.out.println(a.name);   //mohan
        System.out.println(a.age);   //14
        System.out.println(c.name);  //om
        System.out.println(c.age);   //9



    }
>>>>>>> 0577215d02043d72dfc9f3b7d836e8da7fb466d6
}