//it is diffcult to handle so many variable like n,a so in Q2
class Student1{
    String name;
    int age;

    Student1(String n , int a){
        name = n;
        age = a;
    }
}

class Q1{
    public static void main(String[] agrs){
        Student1 x = new Student1("om",15);
        //default value
        System.out.println(x.name);     
        System.out.println(x.age);  

        Student1 y = new Student1("sarita" , 23);

        System.out.println(y.name);     
        System.out.println(y.age);

    }
}