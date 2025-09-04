import java.util.Comparator;

class AgeAscSort implements Comparator<Student> {
    public int compare(Student a, Student b) {
        return a.age.compareTo(b.age);
    }
} 
 
