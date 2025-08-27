//String have redifed equals() method given by Object Class to a meaniful implementation
class G{
    public static void main(String[] args){
        String x = new String("om");
        String y = new String("om");

        System.out.println(x == y);  //false
        System.out.println(x.equals(y)); //true

    }
}