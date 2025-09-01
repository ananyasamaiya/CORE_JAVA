class P{
    public static void main(String[] args) throws InterruptedException{
        System.out.println("A");
        Thread x = Thread.currentThread();

        x.join();  //deadlock

        System.out.println("B");
    }
}