//generating 6 character (for otp use)

class E{
    public static void main(String[] args){
        String abc123 = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        StringBuilder str = new StringBuilder();
        int len = abc123.length();
        for(int i=0; i<6; i++){
            int index = (int)(Math.random()*len);
            str.append(abc123.charAt(index));
        }
        System.out.println(str);
    }
}