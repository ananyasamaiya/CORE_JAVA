import java.text.NumberFormat;
import java.util.Locale;

class O {
    public static void main(String[] args) {
        Locale a = new Locale("hi", "IN");
        Locale b = new Locale("fr", "FR");
        Locale c = new Locale("de", "DE");
        Locale d = new Locale("zh", "CN");
        Locale e = new Locale("da", "DK");

        NumberFormat x = NumberFormat.getCurrencyInstance(d);

        float w = 345678.23232f;

        String s = x.format(w);

        System.out.println(s);
    }
}