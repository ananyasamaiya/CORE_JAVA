import java.util.HashSet;

class G{
    public static void main(String[] args){
        HashSet<String> set = new HashSet<String>();

        set.add("mohan");
        set.add("raj");
        set.add("mukund");
        set.add("neelesh");
        set.add("ratan");

        System.out.println(set);
        // String x = new String("vineet");
        String x = new String("mukund");
        System.out.println(set.contains(x));
        System.out.println(set);

    }
}