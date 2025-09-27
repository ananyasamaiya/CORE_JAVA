import java.util.ArrayList;
// import java.util.function.Consumer;

class V {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        
        names.add("goutam");
        names.add("vikramaditya");
        names.add("chlukya");
        names.add("gupt");
        names.add("bindusar");

        // Consumer<String> y = (next) -> System.out.print(next + " - ");
        names.forEach((next) -> System.out.print(next + " - "));
    }    
}