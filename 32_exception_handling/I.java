//Even if in main unchecked Exception is not generating we can throws unchecked Exception 
// it is OK

class I{
    public static void main(String[] args) throws ArrayIndexOutOfBoundsException{
        System.out.println("A");
        System.out.println("B");
    }
}