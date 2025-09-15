import java.io.Serializable;

class Student implements Serializable {
    String name;
    int age;
    float marks;  
    
    public String toString() {
        return name + " - " + age + " - " + marks;
    }
}