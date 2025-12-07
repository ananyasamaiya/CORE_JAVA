class B{
    public static void main(String[] args){
        String abc123 = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";

        int len = abc123.length();
        for(int i=0; i<100; i++){
            System.out.println(Math.random()*len);
        }
    }
}