class Student1 {
    String name;
    int age;

    Student1(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args) {
        Student1 x = new Student1("yam",1000);

        Student1 y = x.clone();
    }    
}


// Student1.java:13: error: incompatible types: Object cannot be converted to Student1
//         Student1 y = x.clone();
//                      ^
// 1 error