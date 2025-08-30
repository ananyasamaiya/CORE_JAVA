// commond-line argument: 45 or om or <blank>
class K1{
    public static void main(String[] args){
        System.out.println("start");
        int i = 0;
        try{
             i = Integer.parseInt(args[0]);
        }catch(Exception e){  // catch-all
            System.out.println(e);
        }
            
        

        System.out.println(i);
        System.out.println("end");
    }
}