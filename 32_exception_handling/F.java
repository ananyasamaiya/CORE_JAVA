//for unchecked exception compiler do not check if we have handle or declare it
class F{
    public static void main(String[] args){
        System.out.println("A");

        String input = args[0];
        
        System.out.println("B");
    }
}

// A
// Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0
//         at F.main(F.java:6)
