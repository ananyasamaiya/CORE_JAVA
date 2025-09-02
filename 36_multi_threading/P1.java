class DThread extends Thread{
    public void run(){
        Thread x = Thread.currentThread();

        for(int i=0; i<30; i++){
            System.out.println(x.getName() + " - " + i);
        }

        System.out.println(x.getName() + " is a daemon Thread : "+ x.isDaemon());
    }
}
class P1{
    public static void main(String[] args){
        
        DThread y = new DThread();
        y.setName("Yam");
        y.setDaemon(true);
        y.start();

        try{ Thread.sleep(1000);} catch(InterruptedException e){ e.printStackTrace();}
    }
}