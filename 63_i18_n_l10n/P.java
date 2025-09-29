import java.text.NumberFormat;

class P {
    public static void main(String[] args) {

        NumberFormat x = NumberFormat.getInstance();

        float w = 345678.23232f;

        x.setMaximumFractionDigits(5);

        String s = x.format(w);

        System.out.println(s);
    }
}