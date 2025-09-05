
import java.util.ArrayList;
import java.util.Vector;
import java.util.LinkedList;
import java.util.List;
import java.util.HashSet;

class C1 {
    public static void main(String[] args) {
        HashSet<List> x1 = new HashSet<ArrayList>();
        HashSet<List> x2 = new HashSet<Vector>();
        HashSet<List> x3 = new HashSet<LinkedList>();
    }    
}


// C1.java:9: error: incompatible types: HashSet<ArrayList> cannot be converted to HashSet<List>
//         HashSet<List> x1 = new HashSet<ArrayList>();
//                            ^
// C1.java:10: error: incompatible types: HashSet<Vector> cannot be converted to HashSet<List>
//         HashSet<List> x2 = new HashSet<Vector>();
//                            ^
// C1.java:11: error: incompatible types: HashSet<LinkedList> cannot be converted to HashSet<List>
//         HashSet<List> x3 = new HashSet<LinkedList>();
//                            ^
// 3 errors