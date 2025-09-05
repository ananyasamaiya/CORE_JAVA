import java.util.ArrayList;

class V1{
    public static void main(String[] args){
        Object x = new ArrayList<Integer>();

        ArrayList<Integer> list = (ArrayList<Integer>)x;

        System.out.println(x);
    }
}