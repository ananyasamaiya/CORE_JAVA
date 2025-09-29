import java.util.Calendar;
import java.util.Date;

class V{
    public static void main(String[] args){
        Calendar x = Calendar.getInstance();

        Date dt = new Date(x.getTimeInMillis());
        System.out.println(dt);

        // x.add(Calendar.HOUR, 5);
        // x.add(Calendar.HOUR, 24);
        x.add(Calendar.HOUR, -1);

        dt = new Date(x.getTimeInMillis());
        System.out.println(dt);
    }
}