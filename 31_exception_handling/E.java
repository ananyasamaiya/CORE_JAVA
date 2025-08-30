class E{
    public static void main(String[] args){
        System.out.println("start");
    
        try{
            int y = 12/0;
        }catch(ArithmeticException e){
            System.out.println("Some problem");
        }
    
        System.out.println("end");
    
    
    }
}