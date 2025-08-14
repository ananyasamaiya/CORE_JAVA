package a;
class A{
     public static void main(String[] args) throws 
    CloneNotSupportedException 
    {
        Student x = new Student();
        x.name = "jagjeet";
        x.age = 14;

        Student y = (Student)x.clone();

        System.out.println(y.name);
        System.out.println(y.age);

        System.out.println(x);
        System.out.println(y);
    }
}

// a\A.java:10: error: clone() has protected access in Object
//         Student y = (Student)x.clone();
//                               ^
// 1 error