import java.text.SimpleDateFormat;
import java.util.Date;

class J{
    public static void main(String[] args){
        Date dt = new Date();

        // SimpleDateFormat x = new SimpleDateFormat("EEEEE dd MM, yyyy");
        SimpleDateFormat x = new SimpleDateFormat("EEE dd MM, yyyy");

        String fd = x.format(dt);

        System.out.println(fd);
    }
}