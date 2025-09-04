import java.util.Comparator;

class NameAscSort implements Comparator<Student> {
    public int compare(Student a, Student b) {
        return a.name.compareTo(b.name);
    }
} 