class P {
    static void pro(String nm1, String nm2, String nm3, int... marks) {
        System.out.println(nm1);
        System.out.println(nm2);
        System.out.println(nm3);
        System.out.println("~~~~~~~~~~~");
        for(int next : marks)
            System.out.println(next); 
    }

    public static void main(String[] args) {
        pro("om","ram","raj", 12, 34, 56);
    }    
}
