class Golu{

}

class E{
    public static void main(String[] args){
        try{
            Class k1 = Class.forName("E");
            System.out.println(k1);

            Class k2 = Class.forName("Golu");
            System.out.println(k2);
        } catch(ClassNotFoundException e){
            e.printStackTrace();
        }
    }
}