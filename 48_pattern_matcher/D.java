import java.util.regex.Pattern;
import java.util.regex.Matcher;

class D{
    public static void main(String[] args){
        Pattern p = Pattern.compile("mohan");
        Matcher m = p.matcher("student mohan is a good boy");

        System.out.println(m);

        m.find();
        
        System.out.println(m);
    }
}