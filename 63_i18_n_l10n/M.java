import java.text.NumberFormat;
import java.util.Locale;

class M {
    public static void main(String[] args) {
        Locale a = new Locale("hi", "IN");
        Locale b = new Locale("fr", "FR");
        Locale c = new Locale("de", "DE");
        Locale d = new Locale("zh", "CN");
        Locale e = new Locale("da", "DK");

        NumberFormat x = NumberFormat.getInstance(e);

        int y = 745231898;

        String z = x.format(y);

        System.out.println(z);
    }
}