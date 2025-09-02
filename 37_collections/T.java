import java.util.ArrayList;

class T {
    public static void main(String[] args) {
        ArrayList<Integer> x = new ArrayList<Integer>();

        x.add(7);  // index 0
        x.add(2);  // index 1
        x.add(1);  // index 2
        x.add(5);  // index 3
        x.add(8);  // index 4

        System.out.println(x);

        // List.remove(int) => int->index
        System.out.println(x.remove(2));

        System.out.println(x);
    
    }
}