import java.util.ArrayList;

class F{
    public static void main(String[] args){
        ArrayList<int> a;
        ArrayList<char> b;
    }
}

// F:\Java\examples\42_generics>javac F.java
// F.java:5: error: unexpected type
//         ArrayList<int> a;
//                   ^
//   required: reference
//   found:    int
// F.java:6: error: unexpected type
//         ArrayList<char> b;
//                   ^
//   required: reference
//   found:    char
// 2 errors
