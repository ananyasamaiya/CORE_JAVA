import java.util.regex.Pattern;
import java.util.regex.Matcher;

class G{
    public static void main(String[] args){
        Pattern p = Pattern.compile("ram");
        Matcher m = p.matcher("good boy ram is in class 12th");
    

        System.out.println(m.start());
        System.out.println(m.end());
        System.out.println(m.group());
    }
}

// Exception in thread "main" java.lang.IllegalStateException: No match available
//         at java.base/java.util.regex.Matcher.start(Matcher.java:450)
//         at G.main(G.java:10)