class F{
    F(){
        int y = 12/0;
        System.out.println("C");
    }

    public static void main(String[] args){
        System.out.println("A");

        F x = new F();

        System.out.println("B");
    }
}