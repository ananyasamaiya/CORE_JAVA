import java.util.Date;

class S{
    public static void main(String[] args){
        Date dt = new Date();

        long z = dt.getTime();

        dt.setTime(z + 3600000);

        // System.out.println(z);
        System.out.println(dt);
    }
}