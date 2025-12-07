//generating random character (for otp use)

class D{
    public static void main(String[] args){
        String abc123 = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";

        int len = abc123.length();
        for(int i=0; i<100; i++){
            int index = (int)(Math.random()*len);
            System.out.println(abc123.charAt(index));
        }
    }
}