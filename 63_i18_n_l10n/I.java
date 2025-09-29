import java.text.SimpleDateFormat;
import java.util.Date;

class I{
    public static void main(String[] args){
        Date dt = new Date();

        // SimpleDateFormat x = new SimpleDateFormat("dd MMM yyyy");
        // SimpleDateFormat x = new SimpleDateFormat("dd MMMMM yyyy");
        SimpleDateFormat x = new SimpleDateFormat("dd MM yyyy");

        String fd = x.format(dt);

        System.out.println(fd);
    }
}