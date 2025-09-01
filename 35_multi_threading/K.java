class GThread extends Thread{
    public void run(){
        Thread a = Thread.currentThread();
        for(int i=0; i<100; i++){
           System.out.println(i + " - run() - " + a.getName());
        }
    }
}

class K{
    public static void main(String[] args) throws InterruptedException{
        GThread a = new GThread();
        a.setName("Ketu");
        
        GThread b = new GThread();
        b.setName("Rahul");
        
        a.start();
        b.start();

        Thread x = Thread.currentThread();

        a.sleep(5000);
        for(int i=0; i<30; i++){
            System.out.println(i + " - main() - " + x.getName());
        }
    }
}