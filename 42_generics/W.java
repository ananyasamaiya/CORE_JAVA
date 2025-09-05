import java.util.ArrayList;

class W{
    public static void main(String[] args){
        // ArrayList<Number> x = new ArrayList<Integer>();

        ArrayList<Integer> a = new ArrayList<>();
        ArrayList<Float> b = new ArrayList<>();

        pro(a);
        pro(b);

    }
    static void pro(ArrayList<Number> list){
        //problem no.1 
        for(Number next : list){

        }
        //problem no. 2
        list.add(12);
        list.add(12.54);
    }
}
// W.java:10: error: incompatible types: ArrayList<Integer> cannot be converted to ArrayList<Number>
//         pro(a);
//             ^
// W.java:11: error: incompatible types: ArrayList<Float> cannot be converted to ArrayList<Number>
//         pro(b);
//             ^
// Note: Some messages have been simplified; recompile with -Xdiags:verbose to get full output
// 2 errors