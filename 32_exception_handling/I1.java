//Even if in main checked Exception is not generating we can throws checked Exception 
// it is OK
//catch be no allowd nhi hai throws me

import java.io.FileNotFoundException;
class I1{
    public static void main(String[] args) throws FileNotFoundException{
        System.out.println("A");
        System.out.println("B");
    }
}