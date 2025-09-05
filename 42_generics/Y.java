import java.util.ArrayList;

class Y {
    public static void main(String[] args) {
        // ArrayList<Number> x = new ArrayList<Integer>();    // NOT OK     
    
        ArrayList<Integer> a = new ArrayList<>();
        a.add(23);
        a.add(24);

        ArrayList<Float> b = new ArrayList<>();
        b.add(2.3f);
        b.add(3.5f);
        
        pro(a);
        pro(b);
    }    
    static void pro(ArrayList<? extends Number> list){
        //problem no.1 
        for(Number next : list){
            System.out.println(next);
        }
        //problem no. 2 Don't add any record...
        // list.add(12);
        // list.add(12.54);
    }
}

// if we add error
// Y.java:24: error: incompatible types: int cannot be converted to CAP#1
//         list.add(12);
//                  ^
//   where CAP#1 is a fresh type-variable:
//     CAP#1 extends Number from capture of ? extends Number
// Y.java:25: error: incompatible types: double cannot be converted to CAP#1
//         list.add(12.54);
//                  ^
//   where CAP#1 is a fresh type-variable:
//     CAP#1 extends Number from capture of ? extends Number
// Note: Some messages have been simplified; recompile with -Xdiags:verbose to get full output
// 2 errors