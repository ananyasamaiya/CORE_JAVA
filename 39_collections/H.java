import java.util.HashMap;

class H {
    public static void main(String[] args) {
        HashMap<String,Double> x = new HashMap<String,Double>();
        
        x.put("Mohan", 78.89);
        x.put("Rohan", 88.12);
        x.put("Sohan", 63.54);
        x.put("Ganesh", 99.99);
        x.put("Mangesh", 82.59);

        // String str = new String("Ganesh");
        String str = new String("Raju");
        
        System.out.println(x.containsKey(str));
    }
}