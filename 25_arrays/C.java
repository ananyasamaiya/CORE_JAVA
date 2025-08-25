class C{
    public static void main(String[] args){
        char a = 'B';
        byte b = 34;
        short c = 86;
        int d = 103;

        int[] x = {a,b,c,d};

        for(int next: x)
            System.out.println(next);

    }
}