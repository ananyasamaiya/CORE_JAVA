//we need to compile User
class B2{
    public static void main(String[] args) throws ClassNotFoundException{
        Class x = Class.forName("User");

        System.out.println(x);
        
    }
}