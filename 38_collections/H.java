// HashSet do not support indexing
import java.util.HashSet;

class H{
    public static void main(String[] args){
        HashSet<String> set = new HashSet<String>();

        set.add("mohan");
        set.add("raj");
        set.add("mukund");
        set.add("neelesh");
        set.add("ratan");

        for(int i=0; i<set.size(); i++){
            System.out.println(set.get(i));
        }

    }
}

// F:\Java\examples\38_collections>javac H.java
// H.java:14: error: cannot find symbol
//             System.out.println(set.get(i));
//                                   ^
//   symbol:   method get(int)
//   location: variable set of type HashSet<String>
// 1 error