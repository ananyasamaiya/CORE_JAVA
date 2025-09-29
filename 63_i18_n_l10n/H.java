import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

class H {
    public static void main(String[] args) {
        Locale y1 = new Locale("fr", "FR");
        Locale y2 = new Locale("de", "DE");
        Locale y3 = new Locale("zh", "CN");
        Locale y4 = new Locale("hi", "IN");
        Locale y5 = new Locale("da", "DK");

        Date dt = new Date();

        System.out.println(dt);
        System.out.println("------------------------");
        
        DateFormat x1 = DateFormat.getDateInstance(DateFormat.FULL, y1);
        DateFormat x2 = DateFormat.getDateInstance(DateFormat.FULL, y2);
        DateFormat x3 = DateFormat.getDateInstance(DateFormat.FULL, y3);
        DateFormat x4 = DateFormat.getDateInstance(DateFormat.FULL, y4);
        DateFormat x5 = DateFormat.getDateInstance(DateFormat.FULL, y5);

        System.out.println("FULL France: " + x1.format(dt));
        System.out.println("FULL Germany: " + x2.format(dt));
        System.out.println("FULL China: " + x3.format(dt));
        System.out.println("FULL Bharat: " + x4.format(dt));
        System.out.println("FULL Denmark: " + x5.format(dt));
    }
}