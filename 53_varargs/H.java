class H {
    static void mno(int... x) {
        for(int next : x)
            System.out.print(next + " "); 

        System.out.println("\n==============");
    }   
    
    public static void main(String[] args) {
        H.mno();
        H.mno(12);
        H.mno(12, 23);
        H.mno(12, 23, 45);
        H.mno(12, 23, 45, 56);

        int[] w = {1, 45, 23, 89, 34, 78, 90, 23};

        H.mno(w);
    }
}