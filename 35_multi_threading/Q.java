class KThread extends Thread{
    public void run(){
        Thread x = Thread.currentThread();

        for(int i=0; i<300; i++){
            if(i==15){
                try{ Q.x.join();} catch(InterruptedException e) {e.printStackTrace();}
            }
            System.out.println(i + " - " + x.getName());
        }
    }
}

class Q{
    static Thread x = Thread.currentThread();
    public static void main(String[] args){
        KThread a = new KThread();
        a.setName("A");
        a.start();
        Thread x = Thread.currentThread();
        for(int i=0; i<30; i++){
            if(i==15){
                try{ Q.x.join();} catch(InterruptedException e) {e.printStackTrace();}
            }
            System.out.println(i + " - " + x.getName());
        }
    }
}