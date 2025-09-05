import java.util.ArrayList;

class W1{
    public static void main(String[] args){
        // ArrayList<Number> x = new ArrayList<Integer>();

        ArrayList<Integer> a = new ArrayList<>();
        ArrayList<Float> b = new ArrayList<>();

        pro(a);
        pro(b);

    }
    static void pro(ArrayList<Integer> list){
        //problem no.1 
        for(Integer next : list){

        }
        //problem no. 2
        list.add(12);
        // list.add(12.54);
    }
    static void pro(ArrayList<Float> list){
        //problem no.1 
        for(Float next : list){

        }
        //problem no. 2
        list.add(12);
        list.add(12.54f);
    }
}

// W1.java:23: error: name clash: pro(ArrayList<Float>) and pro(ArrayList<Integer>) have the same erasure
//     static void pro(ArrayList<Float> list){
//                 ^
// W1.java:29: error: incompatible types: int cannot be converted to Float
//         list.add(12);
//                  ^
// Note: Some messages have been simplified; recompile with -Xdiags:verbose to get full output
// 2 errors