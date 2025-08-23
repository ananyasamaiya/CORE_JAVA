/*
1 way-
initialized each variable one at a time x.name =.. ,x.degree = ....

2-way (this way)-
initialized all using parametized constructor
*/

class T{
    public static void main(String[] args){
        Student1 x = new Student1("JEC","BE","CS","Om",21,"7878787878");

        Teacher1 y = new Teacher1("Teacher",12,3000,"Mr.Gopal",48,"9999999999");


        System.out.println(x.degree);
        System.out.println(y.salary);
    }
}