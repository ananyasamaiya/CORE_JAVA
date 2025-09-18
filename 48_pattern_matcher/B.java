import java.util.regex.Pattern;
import java.util.regex.Matcher;

class B{
    public static void main(String[] args){
        Pattern p = new Pattern("",0);
    }
}

// B.java:6: error: Pattern(String,int) has private access in Pattern
//         Pattern p = new Pattern("",0);
//                     ^
// 1 error
