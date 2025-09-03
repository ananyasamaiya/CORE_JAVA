import java.util.HashSet;
import java.util.Iterator;

class J{
    public static void main(String[] args){
        HashSet<String> set = new HashSet<String>();

        set.add("mohan");
        set.add("raj");
        set.add("mukund");
        set.add("neelesh");
        set.add("ratan");

        for(String element : set){
            System.out.println(element);
        }

    }
}