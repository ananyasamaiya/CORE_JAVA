import java.util.ArrayList;

@Deprecated
class V1 {

}

class V {
    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        @SuppressWarnings("deprecation")
        V1 x;

        ArrayList y = new ArrayList();

        y.add(23);
    }
}