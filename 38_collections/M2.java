//here we are using 1 object so it works


import java.util.HashSet;

class M2 {
    public static void main(String[] args) {
        HashSet<Student1> set = new HashSet<Student1>();

        Student1 a = new Student1("om", 12);
        Student1 b = new Student1("raj", 8);
        Student1 c = new Student1("golu", 14);
        Student1 d = new Student1("vivek", 9) ;
        Student1 e = new Student1("ram", 10) ;
        set.add(a);
        set.add(b);
        set.add(c);
        set.add(d);
        set.add(e);

        System.out.println(set);
        
        Student1 y = c;
        System.out.println(set.remove(y));
        
        System.out.println(set);
    }
}