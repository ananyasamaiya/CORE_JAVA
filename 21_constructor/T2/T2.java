/*
1 way-
initialized each variable one at a time x.name =.. ,x.degree = ....
 
2 way-
initialized all using parametized constructor

3 way- 
move all the common properties of Student and Teacher to class User (name,age,phone)

way (a)
in this all the common variable is only declare but we are still initializing them again and again in each constructor

way(b)
here we are giving value of these common value to User1 class (parent class) using super(name,age,phone)
*/

class T2{
    public static void main(String[] args){
        Student3 x = new Student3("JEC","BE","CS","Om",21,"7878787878");

        Teacher3 y = new Teacher3("Teacher",12,3000,"Mr.Gopal",48,"9999999999");


        System.out.println(x.degree);
        System.out.println(y.salary);
    }
}