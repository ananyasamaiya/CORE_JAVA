import java.util.ArrayList;

class T{
    public static void main(String[] args){
        ArrayList y = pro();

        y.add("jai");
        y.add(true);

        System.out.println(y);
    }
    static ArrayList<Integer> pro(){
        ArrayList<Integer> z = new ArrayList<>();

        z.add(23);
        z.add(56);
        // z.add("76");

        return z;
    }
}