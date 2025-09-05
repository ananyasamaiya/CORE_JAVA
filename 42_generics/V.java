import java.util.ArrayList;

class V{
    public static void main(String[] args){
        Object x = new ArrayList<Integer>();

        ArrayList<Integer> list = x;
    }
}

// V.java:7: error: incompatible types: Object cannot be converted to ArrayList<Integer>
//         ArrayList<Integer> list = x;
//                                   ^
// 1 error