class Student3 {
    String name;
    int age;

    Student3(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args) {
        Student3 x = new Student3("yam",1000);

        try {
            Student3 y = (Student3)x.clone();
        } catch(CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }    
}


// java.lang.CloneNotSupportedException: Student3
//         at java.base/java.lang.Object.clone(Native Method)
//         at Student3.main(Student3.java:14)