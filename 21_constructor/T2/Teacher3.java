class Teacher3 extends User1{
    String designation;
    int experience;
    float salary;
    // String name;
    // int age;
    // String phone;

    public Teacher3(String designation,int experience,float salary,String name,int age,String phone){
        super(name,age,phone);
        this.designation = designation;
        this.experience = experience;
        this.salary= salary;
        // this.name = name;
        // this.age = age;
        // this.phone = phone;
    }
} 