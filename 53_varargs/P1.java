class P1 {
    static void pro(String[] names, int... marks) {
        for(String next : names)
            System.out.println(next); 
        System.out.println("~~~~~~~~~~~");
        for(int next : marks)
            System.out.println(next); 
    }

    public static void main(String[] args) {
        // pro("om","ram","raj", 12, 34, 56);
        // pro({"om","ram","raj"}, 12, 34, 56);
        pro(new String[]{"om","ram","raj"}, 12, 34, 56);
    }    
}
