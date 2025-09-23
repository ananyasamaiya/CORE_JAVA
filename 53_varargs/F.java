class F{
    static void mno(int... x){

    }
    public static void main(String[] args){
        F.mno();
        F.mno(12);
        F.mno(12, 23);
        F.mno(12, 23, 45);
        F.mno(12, 23, 45, 56);

        int[] w = {1, 45, 23, 89, 34, 78, 90, 23};

        F.mno(w);
    }
}