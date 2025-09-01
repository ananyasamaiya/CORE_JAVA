class Y1Runnable implements Runnable{
    public void run(){
        Z.pro();
        
    }
}

class Y2Runnable implements Runnable{
    public void run(){
        Z.info();
        
}
}

class Z{
    public static void main(String[] args){
        Thread t1 = new Thread(new Y1Runnable(), "A");
        Thread t2 = new Thread(new Y2Runnable(), "B");

        t1.start();
        t2.start();
    }

    static void pro(){
        Thread x = Thread.currentThread();
        for(int i=0; i<30; i++){
            
            try{ Thread.sleep(30);}catch(InterruptedException e){ e.printStackTrace();}
            System.out.println(i + " -" + x.getName());
        }
    }

    static void info(){
        Thread x = Thread.currentThread();
        for(int i=0; i<30; i++){
            try{ Thread.sleep(30);}catch(InterruptedException e){ e.printStackTrace();}
            System.out.println(i + " -" + x.getName());
        }
    }
}