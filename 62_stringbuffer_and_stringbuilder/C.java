class C {
    public static void main(String[] args) {
        StringBuffer x = new String();

        String y = new StringBuffer("om");
    }    
}

// C.java:3: error: incompatible types: String cannot be converted to StringBuffer
//         StringBuffer x = new String();
//                          ^
// C.java:5: error: incompatible types: StringBuffer cannot be converted to String
//         String y = new StringBuffer("om");
//                    ^
// 2 errors