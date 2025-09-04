import java.util.Comparator;

class AgeDscSort implements Comparator<Student> {
    public int compare(Student a, Student b) {
        return b.age.compareTo(a.age);
    }
}