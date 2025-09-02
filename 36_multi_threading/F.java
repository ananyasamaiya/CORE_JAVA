//both method are non-static and have synchronized block 
// both run in context of same object (Class Object)
//  output - one after another
class C1Runnable implements Runnable {
    public void run() {
        F.a.pro();        
    }
}

class C2Runnable implements Runnable {
    public void run() {
        F.b.info();
    }
}

class F {
    static F a = new F();
    static F b = new F();

    public static void main(String[] args) {
        new Thread(new C1Runnable(), "A").start();
        new Thread(new C2Runnable(), "B").start();       
    }   
    
    void pro() {
        synchronized(F.class) {
            String name = Thread.currentThread().getName();
            for(int i=0;i<40;i++) {
                try { Thread.sleep(200); } catch(InterruptedException e) { e.printStackTrace(); }
                System.out.println(i + " - " + name);
            }
        }
    }
    
    void info() {
        synchronized(F.class) {
            String name = Thread.currentThread().getName();
            for(int i=0;i<40;i++) {
                try { Thread.sleep(200); } catch(InterruptedException e) { e.printStackTrace(); }
                System.out.println(i + " - " + name);
            }
        }
    }
}