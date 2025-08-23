/*
1 way-
initialized each variable one at a time x.name =.. ,x.degree = ....

2 way-
initialized all using parametized constructor

3 way- 
move all the common properties of Student and Teacher to class User (name,age,phone)
way (a)
in this all the common variable is only declare but we are still initializing them again and again in each constructor

*/

class T1{
    public static void main(String[] args){
        Student2 x = new Student2("JEC","BE","CS","Om",21,"7878787878");

        Teacher2 y = new Teacher2("Teacher",12,3000,"Mr.Gopal",48,"9999999999");


        System.out.println(x.degree);
        System.out.println(y.salary);
    }
}