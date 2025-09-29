import java.text.DateFormat;
import java.util.Date;

class F{
    public static void main(String[] args){
        Date dt = new Date();

        System.out.println(dt);
        System.out.println("------------------------");

        DateFormat x = DateFormat.getDateInstance();

        System.out.println(x.format(dt));
        //output
    //     Mon Sep 01 17:28:49 IST 2025
    //     ------------------------
    //     01-Sep-2025
    }
}