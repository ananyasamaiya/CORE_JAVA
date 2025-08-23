class Student{
    String name;
    int age;
}

class Q{
    public static void main(String[] agrs){
        Student x = new Student();
        //default value
        System.out.println(x.name);     
        System.out.println(x.age);  

        x.name = "vikas";
        x.age = 13;

        System.out.println(x.name);     
        System.out.println(x.age);

    }
}