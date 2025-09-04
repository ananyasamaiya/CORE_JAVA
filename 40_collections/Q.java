//if we get positive or zero means element is found
// else if get negative result when element is not found
// Formula to calculate that is (-(insertion point)-1)
import java.util.Collections;
import java.util.ArrayList;

class Q {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();

        list.add("prithvi");
        list.add("agni");
        list.add("pinaka");
        list.add("aakash");
        list.add("naag");
        list.add("brahmos");
        list.add("kusha");
        list.add("k6");

        System.out.println(list);
        
        Collections.sort(list);
        
        System.out.println(list);

        // System.out.println(Collections.binarySearch(list, "kinjal"));
        System.out.println(Collections.binarySearch(list, "P15"));
    }
}