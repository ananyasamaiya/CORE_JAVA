import java.util.ArrayList;

class S1 {
    public static void main(String[] args) {
        pro(info());
    }

    // old
    static ArrayList info() {
        ArrayList list = new ArrayList();
        
        list.add("ram");
        list.add(false);
        list.add('A');

        return list;
    }

    // new
    static void pro(ArrayList<Integer> x) {
        System.out.println(x);

        x.add(45);
        x.add(78);
        // x.add("89");

        System.out.println(x);
    }
}