class DThread extends Thread{
    public void run(){
        EThread a = new EThread();
        a.setName("chitragupt");
        a.start();
        Thread x = Thread.currentThread();

        for(int i=0; i<30; i++){
            System.out.println(x.getName() + " - " + i);
        }

        System.out.println(x.getName() + " is a daemon Thread : "+ x.isDaemon());
    }
}
class EThread extends Thread{
    public void run(){
        Thread x = Thread.currentThread();

        for(int i=0; i<30; i++){
            System.out.println(x.getName() + " - " + i);
        }

        System.out.println(x.getName() + " is a daemon Thread : "+ x.isDaemon());
    }
}
class R{
    public static void main(String[] args){
        
        DThread y = new DThread();
        y.setName("Yamraj");
        y.setDaemon(true);
        y.start();

        try{ Thread.sleep(35);} catch(InterruptedException e){ e.printStackTrace();}
    }
}