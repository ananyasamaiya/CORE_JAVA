<<<<<<< HEAD
//static variable value change by multiple object

class Student1 {
    static String name;
    static int age;

    public static void main(String[] args )
    {
        Student1 a = new Student1();
        a.name = "mohan";
        a.age = 14;

        Student1 b = new Student1();
        b.name = "dinesh";
        b.age = 18;

        Student1 c = new Student1();
        b.name = "om";
        b.age = 9;

        System.out.println(b.name);  //om
        System.out.println(b.age);   //9
        System.out.println(a.name);   //om
        System.out.println(a.age);   //9
        System.out.println(c.name);  //om
        System.out.println(c.age);   //9



    }
=======
//static variable value change by multiple object

class Student1 {
    static String name;
    static int age;

    public static void main(String[] args )
    {
        Student1 a = new Student1();
        a.name = "mohan";
        a.age = 14;

        Student1 b = new Student1();
        b.name = "dinesh";
        b.age = 18;

        Student1 c = new Student1();
        b.name = "om";
        b.age = 9;

        System.out.println(b.name);  //om
        System.out.println(b.age);   //9
        System.out.println(a.name);   //om
        System.out.println(a.age);   //9
        System.out.println(c.name);  //om
        System.out.println(c.age);   //9



    }
>>>>>>> 0577215d02043d72dfc9f3b7d836e8da7fb466d6
}