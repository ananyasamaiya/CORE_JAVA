class Student3 extends User1{
    String college;  
    String degree;  
    String branch;  
    // String name;
    // int age;  
    // String phone;  

    public Student3(String college,String degree, String branch, String name, int age,String phone){
        super(name,age,phone);
        this.college = college;
        this.degree = degree;
        this.branch = branch;
        // this.name = name;
        // this.age = age;
        // this.phone =  phone;
    } 
}