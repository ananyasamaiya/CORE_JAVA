import java.util.TreeSet;

//why does toArrar(T[]) have return type??
//if we give an array which is not of required size so it create an array and return it 
class B1 {
    public static void main(String[] args) {
        TreeSet<String> set = new TreeSet<String>();

        set.add("sarvan");
        set.add("gitesh");
        set.add("manoj");
        set.add("vikas");
        set.add("bijendra");
        set.add("deepak");

        System.out.println(set);

        String[] ar = new String[0];
        String[] arr = set.toArray(ar); 

        System.out.println(ar == arr);
        for(String next : arr) {
            
            System.out.print(next.length() + " ~ " + next + "   ");
        }
    }
}