import java.util.Calendar;
import java.util.Date;

class W{
    public static void main(String[] args){
        Calendar x = Calendar.getInstance();

        Date dt = new Date(x.getTimeInMillis());
        System.out.println(dt);
        
        x.add(Calendar.MONTH, 2);
        // x.add(Calendar.YEAR, 2);

        dt = new Date(x.getTimeInMillis());
        System.out.println(dt);
    }
}