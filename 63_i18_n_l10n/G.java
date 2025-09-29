import java.text.DateFormat;
import java.util.Date;

class G {
    public static void main(String[] args) {
        Date dt = new Date();

        System.out.println(dt);
        System.out.println("------------------------");
        
        DateFormat x1 = DateFormat.getDateInstance(DateFormat.DEFAULT);
        DateFormat x2 = DateFormat.getDateInstance(DateFormat.FULL);
        DateFormat x3 = DateFormat.getDateInstance(DateFormat.LONG);
        DateFormat x4 = DateFormat.getDateInstance(DateFormat.MEDIUM);
        DateFormat x5 = DateFormat.getDateInstance(DateFormat.SHORT);

        System.out.println("DEFAULT: " + x1.format(dt));
        System.out.println("FULL: " + x2.format(dt));
        System.out.println("LONG: " + x3.format(dt));
        System.out.println("MEDIUM: " + x4.format(dt));
        System.out.println("SHORT: " + x5.format(dt));
    }
}