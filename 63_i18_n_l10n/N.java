import java.text.NumberFormat;

class N {
    public static void main(String[] args) {
        NumberFormat x = NumberFormat.getCurrencyInstance();

        float a = 345678.23232f;

        String s = x.format(a);

        System.out.println(s);
    }
}