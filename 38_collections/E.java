import java.util.HashSet;

class E{
    public static void main(String[] args){
        HashSet<String> set = new HashSet<String>();

        System.out.println(set.isEmpty());
        System.out.println(set.size());

        set.add("mohan");
        set.add("raj");
        set.add("mukund");
        set.add("neelesh");
        set.add("ratan");

        System.out.println(set);
        System.out.println(set.isEmpty());
        System.out.println(set.size());

    }
}