import java.text.NumberFormat;

class Q{
    public static void main(String[] args){
        // NumberFormat x = NumberFormat.getInstance();
        NumberFormat x = NumberFormat.getCurrencyInstance();

        float w =  345678.23232f;

        System.out.println(x.getMaximumFractionDigits());

        String s = x.format(w);

        System.out.println(s);
    }
}