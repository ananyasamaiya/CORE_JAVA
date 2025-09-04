import java.util.HashSet;
import java.util.ArrayList;

class H1{
    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(23);
        list.add(25);
        list.add(98);
        list.add(98);
        list.add(35);
        list.add(64);

        HashSet<Integer> set = new HashSet<Integer>(list);

        System.out.println(list);
        System.out.println(set);
    }
}