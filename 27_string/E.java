class E{
    public static void main(String[] args){
        String a = new String("om");
        String b = new String("om");
        String c = new String("om");

        System.out.println(a == b); //false
        System.out.println(b == c); //false
        System.out.println(a == c); //false
    }
}