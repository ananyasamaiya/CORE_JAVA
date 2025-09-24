//we need to compile User
class B1{
    public static void main(String[] args){
        try{
            Class x = Class.forName("User");

            System.out.println(x);
        }catch(ClassNotFoundException e){
            e.printStackTrace();
        }
    }
}