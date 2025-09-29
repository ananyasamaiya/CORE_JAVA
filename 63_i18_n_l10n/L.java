import java.text.NumberFormat;

class L{
    public static void main(String[] args){
        NumberFormat x = NumberFormat.getInstance();

        int y = 745231898;

        String z = x.format(y);

        System.out.println(z);
    }
}