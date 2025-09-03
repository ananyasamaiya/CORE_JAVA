import java.util.HashMap;

class K {
    public static void main(String[] args) {
        HashMap<String,Double> x = new HashMap<String,Double>();
        
        x.put("Mohan", 78.89);
        x.put(null, 88.12);
        x.put("Sohan", null);
        x.put("Ganesh", 99.99);
        x.put("Mangesh", null);

        System.out.println(x);
    }
}