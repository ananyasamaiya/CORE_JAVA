class Student2 {
    String name;
    int age;

    Student2(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args) {
        Student2 x = new Student2("yam",1000);

        Student2 y = (Student2)x.clone();
    }    
}

// Student2.java:13: error: unreported exception CloneNotSupportedException; must be caught or declared to be thrown
//         Student2 y = (Student2)x.clone();
//                         ^
// 1 error