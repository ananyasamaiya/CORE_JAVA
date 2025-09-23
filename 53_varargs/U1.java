class U1 {
    
    static void pro(int... x) {
        System.out.println("Hello");
    }

    static void pro(Integer... x) {
        System.out.println("Hi");
    }
    
    public static void main(String[] args) {
        pro(new int[]{12, 34, 67});
    }
}