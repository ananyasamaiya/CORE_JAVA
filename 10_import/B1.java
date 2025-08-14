//since all the file are in different folder we need to import them to use them
import java.io.File;

class B1{
    public static void main(String[] args)
    {
        System.out.println("~~~~~~~~~~start~~~~~~~~~");

        File a;
        Date b;
        Format c;
        ArrayList d;

        System.out.println("~~~~~~~~~~end~~~~~~~~~");

    } 
}

// B1.java:10: error: cannot find symbol
//         Data b;
//         ^
//   symbol:   class Data
//   location: class B1
// B1.java:11: error: cannot find symbol
//         Format c;
//         ^
//   symbol:   class Format
//   location: class B1
// B1.java:12: error: cannot find symbol
//         ArrayList d;
//         ^
//   symbol:   class ArrayList
//   location: class B1
// 3 errors
