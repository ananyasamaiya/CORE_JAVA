 
//1 method is static and synchronized another is non-static and synchronized
// 1 run in context of Class object(B) another run in context of B object
//OUTPUT - mix

class B1Runnable implements Runnable {
    public void run() {        
        B.pro();
    }
}

class B2Runnable implements Runnable {
    public void run() {
        B.m.info();
    }
}

class B {
    static B m = new B();
    public static void main(String[] args) {
        Thread t1 = new Thread(new B1Runnable(), "B");    
        Thread t2 = new Thread(new B2Runnable(), "B");       
        t1.start();
        t2.start();
    }       

    synchronized static void pro() {
        Thread x = Thread.currentThread();
        for(int i=0;i<30;i++) {
            try { Thread.sleep(30);} catch(InterruptedException e) { e.printStackTrace();}
            System.out.println(i + " pro()- " + x.getName());
        }
    }

    synchronized void info() {
        Thread x = Thread.currentThread();
        for(int i=0;i<30;i++) {
            try { Thread.sleep(30);} catch(InterruptedException e) { e.printStackTrace();}
            System.out.println(i + " info()- " + x.getName());
        }
    }
}