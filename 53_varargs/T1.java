class T1 {
    
    static void pro(int... x) {
        System.out.println("Hello");
        for(int next : x)
            System.out.println(next);
    }

    // static void pro(Integer... x) {
    //     System.out.println("Hi");
    // }
    
    public static void main(String[] args) {
        pro(12, 34, 67);
    }
}