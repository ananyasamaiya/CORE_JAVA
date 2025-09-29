import java.text.SimpleDateFormat;
import java.util.Date;

class K {
    public static void main(String[] args) {
        Date dt = new Date();        
        
        SimpleDateFormat x = new SimpleDateFormat("EEEEE dd/MM/yyyy - HH:mm:ss,S");

        String fd = x.format(dt);

        System.out.println(fd);
    }    
}