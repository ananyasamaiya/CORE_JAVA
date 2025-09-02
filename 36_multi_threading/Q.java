class DThread extends Thread{
    public void run(){
        Thread x = Thread.currentThread();

        for(int i=0; i<30; i++){
            System.out.println(x.getName() + " - " + i);
        }

        System.out.println(x.getName() + " is a daemon Thread : "+ x.isDaemon());
    }
}
class Q{
    public static void main(String[] args){
        
        DThread y = new DThread();
        y.setName("Yam");
        y.start();
        y.setDaemon(true);

        try{ Thread.sleep(35);} catch(InterruptedException e){ e.printStackTrace();}
    }
}

// Exception in thread "main" java.lang.IllegalThreadStateException
//         at java.base/java.lang.Thread.setDaemon(Thread.java:1414)
//         at Q.main(Q.java:18)