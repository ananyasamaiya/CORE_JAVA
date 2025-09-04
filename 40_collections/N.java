//if we are not making a class Comparable 
//we need to give sort the comparator also as parmerter 
//so it know on what based we need to sort
import java.util.Collections;
import java.util.ArrayList;
import java.util.Comparator;

class N {
    public static void main(String[] args) {
        ArrayList<Employee> list = new ArrayList<Employee>();

        list.add(new Employee("ketak", 8));
        list.add(new Employee("hitesh", 15));
        list.add(new Employee("sarvan", 10));
        list.add(new Employee("giyan", 17));
        list.add(new Employee("giyan", 7));
        list.add(new Employee("ninja", 12));

        System.out.println(list);

        Comparator<Employee> comp = new AgeAscSort();
        Collections.sort(list, comp);

        System.out.println(list);
    }
}
