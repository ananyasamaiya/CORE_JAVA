import java.util.ArrayList;

class Q{
    public static void main(String[] args){
        ArrayList<Integer> x = new ArrayList<Integer>();

        x.add(67);
        x.add(12);
        x.add(45);
        x.add(76);
        x.add(35);

        System.out.println(x);  //[67, 12, 45, 76, 35]

        //replace
        Integer y = x.set(2, 99);

        System.out.println(x);  //[67, 12, 99, 76, 35]
        System.out.println(y);  //45
    }
}