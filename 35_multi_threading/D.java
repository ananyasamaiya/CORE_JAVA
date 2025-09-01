class D{
    public static void main(String[] args){
        Thread a = Thread.currentThread();

        for(int i=0; i<30; i++){
            System.out.println(i + " - main() - " + a.getName());
        }

        aaa();
        
    }

    static void aaa(){
        Thread a = Thread.currentThread();

        for(int i=0; i<30; i++){
            System.out.println(i + " - aaa() - " + a.getName());
        }

    }
}