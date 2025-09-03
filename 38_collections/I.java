import java.util.HashSet;
import java.util.Iterator;

class I{
    public static void main(String[] args){
        HashSet<String> set = new HashSet<String>();

        set.add("mohan");
        set.add("raj");
        set.add("mukund");
        set.add("neelesh");
        set.add("ratan");

        Iterator<String> itr = set.iterator();

        while(itr.hasNext()){
            System.out.println(itr.next());
        }

    }
}