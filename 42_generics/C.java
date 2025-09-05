import java.util.ArrayList;

class C{
    public static void main(String[] args){
        ArrayList<Integer> x = new ArrayList<Integer>();

        x.add(12);
        x.add("om");
        x.add(54.76);
        x.add(true);

        System.out.println(x);

    }
}
// C.java:8: error: incompatible types: String cannot be converted to Integer
//         x.add("om");
//               ^
// C.java:9: error: incompatible types: double cannot be converted to Integer
//         x.add(54.76);
//               ^
// C.java:10: error: incompatible types: boolean cannot be converted to Integer
//         x.add(true);
//               ^
// Note: Some messages have been simplified; recompile with -Xdiags:verbose to get full output
// 3 errors
