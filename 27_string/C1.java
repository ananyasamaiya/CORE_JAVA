class C1{
    public static void main(String[] args){
        String a = "aA *$#@\n_98\u001";

        System.out.println(a);
    }
}

// F:\Java\examples\27_string>javac C1.java
// C1.java:3: error: illegal unicode escape
//         String a = "aA *$#@\n_98\u001";
//                                      ^
// 1 error