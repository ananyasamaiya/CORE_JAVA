import java.util.HashSet;

class F{
    public static void main(String[] args){
        HashSet<String> set = new HashSet<String>();

        set.add("mohan");
        set.add("raj");
        set.add("mukund");
        set.add("vineet");
        set.add("ratan");

        System.out.println(set);
        String x = new String("vineet");
        // String x = new String("raju");
        System.out.println(set.remove(x));
        System.out.println(set);

    }
}