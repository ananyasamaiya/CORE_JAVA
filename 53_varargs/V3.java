class V3 {
    static void pro(String...[] x) {
        for(String[] next : x) {
            for(String nx : next) 
                System.out.println(nx);
            
            System.out.println();
        }
    }

    public static void main(String[] args) {
        String[][] x = {{"om","ram","raj"},{"mohan","dinesh","ganesh","karthik"}};

        pro(x);
    }    
}


// V3.java:2: error: <identifier> expected
//     static void pro(String...[] x) {
//                              ^
// V3.java:2: error: ',', ')', or '[' expected
//     static void pro(String...[] x) {
//                                ^
// 2 errors