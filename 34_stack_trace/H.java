class H{
    {
        System.out.println("M");
        int y = 12/0;
    }

    H(){
        System.out.println("A");
    }
    public static void main(String[] args){
        System.out.println("X");

        H x = new H();

        System.out.println("T");
    }
}