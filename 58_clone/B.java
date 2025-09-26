class Student {
    String name;
    int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
}


class B {
    public static void main(String[] args) {
        Student x = new Student("ram", 12);

        Student y = x.clone();        
    }
}

// B.java:17: error: clone() has protected access in Object
//         Student y = x.clone();
//                      ^
// B.java:17: error: incompatible types: Object cannot be converted to Student
//         Student y = x.clone();
//                            ^
// 2 errors