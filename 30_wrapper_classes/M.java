class M{
    public static void main(String[] args){
        Boolean a = false;
        Boolean b = false;


        Boolean c = Boolean.valueOf(false);
        Boolean d = Boolean.valueOf(false);
        

        System.out.println(a == b);
        System.out.println(b == c);
        System.out.println(c == d);
        System.out.println(d == a);
    }



}