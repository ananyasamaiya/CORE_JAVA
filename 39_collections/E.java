import java.util.HashMap;
class E{
    public static void main(String[] args){
        HashMap x = new HashMap();

        System.out.println(x.isEmpty());
        System.out.println(x.size());

        x.put("mohan", 44.64);
        x.put("Rohan", 88.12);
        x.put("Sohan", 63.54);
        x.put("Ganesh", 99.99);
        x.put("Mangesh", 82.59);
        
        System.out.println(x.isEmpty());
        System.out.println(x.size());
    }
}