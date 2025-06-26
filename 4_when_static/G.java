<<<<<<< HEAD
// making a method to show info making it static
class Student7 {
    String name;
    int age;

    static int maxAge = 20;

    public static void main (String[] args)
    {
        Student7 a = new Student7();
        a.name  = "golu";
        a.age = 12;

        Student7 b = new Student7();
        b.name  = "bholu";
        b.age = 14;

        b.showInfo();
        a.showInfo();
    }

     static void showInfo(){
        System.out.println(name);
        System.out.println(age);
        System.out.println(maxAge);
    }
}


// G.java:23: error: non-static variable name cannot be referenced from a static context
//         System.out.println(name);
//                            ^
// G.java:24: error: non-static variable age cannot be referenced from a static context
//         System.out.println(age);
//                            ^
=======
// making a method to show info making it static
class Student7 {
    String name;
    int age;

    static int maxAge = 20;

    public static void main (String[] args)
    {
        Student7 a = new Student7();
        a.name  = "golu";
        a.age = 12;

        Student7 b = new Student7();
        b.name  = "bholu";
        b.age = 14;

        b.showInfo();
        a.showInfo();
    }

     static void showInfo(){
        System.out.println(name);
        System.out.println(age);
        System.out.println(maxAge);
    }
}


// G.java:23: error: non-static variable name cannot be referenced from a static context
//         System.out.println(name);
//                            ^
// G.java:24: error: non-static variable age cannot be referenced from a static context
//         System.out.println(age);
//                            ^
>>>>>>> 0577215d02043d72dfc9f3b7d836e8da7fb466d6
// 2 errors