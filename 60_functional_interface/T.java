import java.util.ArrayList;
import java.util.function.Consumer;

class A2 implements Consumer<String>{
    public void accept(String next){
        System.out.println(next + " ");
    }
}
class T {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        
        names.add("goutam");
        names.add("vikramaditya");
        names.add("chlukya");
        names.add("gupt");
        names.add("bindusar");

        System.out.println(names);
        
        System.out.println("---------------------------");
        
        for(int i=0;i<names.size();i++) {
            System.out.println(names.get(i));
        }

        System.out.println("---------------------------");
        
        for(String next : names) {
            System.out.println(next);
        }

        System.out.println("---------------------------");

        Consumer<String> a = new A2();
        names.forEach(a);
    }    
}