class C{
    public static void main(String[] args){
        String a = "aA *$#@\n_98\u0041";

        System.out.println(a);
    }
}

// C.java:3: error: illegal escape character
//         String a = "aA *$#@\N_98\u0041";
//                             ^
// 1 error