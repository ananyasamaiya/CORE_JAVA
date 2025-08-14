//Whose path is (short) simple do not import it use it directly with full name

import java.util.Date;
//import java.sql.Date;

class H{
    public static void main(String[] args)
    {
        Date x = new Date();

        java.sql.Date y = new java.sql.Date(78678796);

        // java.sql.Date y = new Date(3443344);     WRONG

       System.out.println(x instanceof java.util.Date);  //true
       System.out.println(x instanceof java.sql.Date);   //false
       System.out.println(y instanceof java.util.Date);  //true
       System.out.println(y instanceof java.sql.Date);   //true

       //We know that sql.Date is child of util.Date
       //That is why it is showing true in both
       //y instanceof java.util.Date and y instanceof java.sql.Date
  

    }
}