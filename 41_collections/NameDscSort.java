import java.util.Comparator;

class NameDscSort implements Comparator<Student> {
    public int compare(Student a, Student b) {
        return b.name.compareTo(a.name);
    }
} 