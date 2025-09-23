class V2 {
    static void pro(String[]... x) {
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