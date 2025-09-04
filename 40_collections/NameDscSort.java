import java.util.Comparator;

class NameDscSort implements Comparator<Employee> {
    public int compare(Employee a, Employee b) {
        return b.name.compareTo(a.name);
    }
} 