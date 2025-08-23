//here we use this keyword which point to instance level variable in that class
/*
we make user define constructor for 2 reason
1 reason - initializing instance level property (variable) using paramertized constructor when object is created

*/
class Student2{
    String name;
    int age;

    Student2(String name , int age){
        this.name = name;
        this.age = age;
    }
}

class Q2{
    public static void main(String[] agrs){
        Student2 x = new Student2("om",15);
        //default value
        System.out.println(x.name);     
        System.out.println(x.age);  

        Student2 y = new Student2("sarita" , 23);

        System.out.println(y.name);     
        System.out.println(y.age);

    }
}