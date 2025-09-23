class V {
    static void pro(String... x) {

    }

    public static void main(String[] args) {
        String[][] x = {{"om","ram","raj"},{"mohan","dinesh","ganesh","karthik"}};

        pro(x);
    }    
}


// V.java:9: error: method pro in class V cannot be applied to given types;
//         pro(x);
//         ^
//   required: String[]
//   found:    String[][]
//   reason: varargs mismatch; String[][] cannot be converted to String
// 1 error