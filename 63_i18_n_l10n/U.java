import java.util.Calendar;

class U{
    public static void main(String[] args){
        Calendar x = Calendar.getInstance();
        
        long y = x.getTimeInMillis();
        System.out.println(x);
        System.out.println("-----------------------------");

        System.out.println(y);

    }
}