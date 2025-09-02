//1 method are non-static and have synchronized block another his static and synchronized
// both run in context of same object (Class Object)
//  output - one after another
class C1Runnable implements Runnable {  public void run() {  H.a.pro();   }}

class C2Runnable implements Runnable {    public void run() {  H.b.info();    }}

class H {
    static H a = new H();    static H b = new H();

    public static void main(String[] args) {      new Thread(new C1Runnable(), "A").start();
        new Thread(new C2Runnable(), "B").start();      }   
    
    void pro() {
        synchronized(H.class) {
            String name = Thread.currentThread().getName();
            for(int i=0;i<40;i++) {     try { Thread.sleep(200); } catch(InterruptedException e) { e.printStackTrace(); }
                System.out.println(i + " - " + name);            }        }    }
    
    static synchronized void info() {        
        String name = Thread.currentThread().getName();
        for(int i=0;i<40;i++) {            try { Thread.sleep(200); } catch(InterruptedException e) { e.printStackTrace(); }
            System.out.println(i + " - " + name);        }    } }