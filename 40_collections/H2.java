import java.util.HashSet;
import java.util.ArrayList;

class H2{
    public static void main(String[] args){
        ArrayList<Student2> list = new ArrayList<Student2>();
        list.add(new Student2("raj", 8));
        list.add(new Student2("golu", 14));
        list.add(new Student2("om", 12));
        list.add(new Student2("vivek", 9));
        list.add(new Student2("golu", 14));
        list.add(new Student2("mayank", 10));

        HashSet<Student2> set = new HashSet<Student2>(list);

        System.out.println(list);
        System.out.println(set);
    }
}