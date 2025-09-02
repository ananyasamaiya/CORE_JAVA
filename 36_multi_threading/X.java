//making our threadgroup using Thread(ThreadGroup group, Runnable target) constructor
// to make thread group is made outside main threadGroup in System ThreadGroup
// using ThreadGroup(ThreadGroup parent, String name constructor

class GRunnable implements Runnable {
    public void run() {        
        try{ Thread.sleep(1000); } catch(InterruptedException e) { e.printStackTrace(); }
    }
}

class X{
    public static void main(String[] args){
        ThreadGroup x = Thread.currentThread().getThreadGroup().getParent();

        ThreadGroup tg = new ThreadGroup(x, "Dholakpur");

        GRunnable r = new GRunnable();

        Thread a1 = new Thread(tg, r);
        a1.setName("Bheem");
        a1.start();
        
        Thread a2 = new Thread(tg, r);
        a2.setName("Raju");
        a2.start();

        Thread a3 = new Thread(tg, r);
        a3.setName("Klaiya");
        a3.start();

        Thread a4 = new Thread(tg, r);
        a4.setName("Jaggu");
        a4.start();

        // try{ Thread.sleep(10); } catch(InterruptedException e) { e.printStackTrace(); }
        System.out.println("System Thread Group's components: " + x.activeCount());
        x.list();
    }
}