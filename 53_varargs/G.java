class G {
    static void mno(int... x) {
        System.out.println(x.length);
    }   
    
    public static void main(String[] args) {
        G.mno();
        G.mno(12);
        G.mno(12, 23);
        G.mno(12, 23, 45);
        G.mno(12, 23, 45, 56);

        int[] w = {1, 45, 23, 89, 34, 78, 90, 23};

        G.mno(w);
    }
}