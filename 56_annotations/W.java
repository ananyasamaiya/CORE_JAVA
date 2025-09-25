import java.util.ArrayList;

@Deprecated
class W1 {
    @Deprecated
    static int y = 90;
}



class W {
    @SuppressWarnings("unchecked")
    @SuppressWarnings("deprecation")
    public static void main(String[] args) {
        // @SuppressWarnings("deprecation")
        W1 x;

        ArrayList y = new ArrayList();

        y.add(23);

        System.out.println(W1.y);
    }
}


// W.java:13: error: SuppressWarnings is not a repeatable annotation type
//     @SuppressWarnings("deprecation")
//     ^
// Note: W.java uses or overrides a deprecated API.
// Note: Recompile with -Xlint:deprecation for details.
// Note: W.java uses unchecked or unsafe operations.
// Note: Recompile with -Xlint:unchecked for details.
// 1 error