import java.util.ArrayList;

class D{
    public static void main(String[] args){
        ArrayList x = new ArrayList();

        x.add(12);
        x.add(34);
        x.add(54);
        x.add(98);

        System.out.println(x);

        Integer str = x.get(1);
    }
}
// D.java:14: error: incompatible types: Object cannot be converted to Integer
//         Integer str = x.get(1);