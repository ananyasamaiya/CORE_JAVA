import java.util.Date;

class R{
    public static void main(String[] args){
        Date dt = new Date();

        long z = dt.getTime();

        System.out.println(z);
        System.out.println(dt);
    }
}