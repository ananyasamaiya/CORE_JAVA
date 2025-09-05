import java.util.ArrayList;

class Q{
    public static void main(String[] args){
        //All ok
        ArrayList a = new ArrayList();
        ArrayList<Integer> b = new ArrayList<Integer>();
        ArrayList<Number> c = new ArrayList();
        ArrayList d = new ArrayList<Number>();
        ArrayList<Number> e = new ArrayList<>();

        //not ok 
        // ArrayList<Number> b = new ArrayList<Integer>();

    }
}