import java.util.ArrayList;

class P{
    public static void main(String[] args){
        ArrayList<Integer> x = new ArrayList<Integer>();

        x.add(67);
        x.add(12);
        x.add(45);
        x.add(76);
        x.add(35);

        System.out.println(x);  //[67, 12, 45, 76, 35]

        //insert
        x.add(2, 99);

        System.out.println(x);  //[67, 12, 99, 45, 76, 35]
    }
}