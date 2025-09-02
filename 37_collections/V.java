import java.util.ArrayList;

class V {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<Student>();

        Student a = new Student("jay", 23);
        Student b = new Student("raghav", 18);
        Student c = new Student("golu", 9);
        Student d = new Student("vikramaditya", 12);
        Student e = new Student("om", 17);

        list.add(a);
        list.add(b);
        list.add(c);
        list.add(d);
        list.add(e);

        System.out.println(list);
    }    
}

// output : [Student@36baf30c, Student@7a81197d, Student@5ca881b5, Student@24d46ca6, Student@4517d9a3]