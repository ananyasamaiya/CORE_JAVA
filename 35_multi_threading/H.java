class DThread extends Thread{
    public void run(){
        Thread a = Thread.currentThread();
        for(int i=0; i<30; i++){
            System.out.println(i + " - run() - " + a.getName());
        }
    }
}

class H{
    public static void main(String[] args){
        DThread a = new DThread();
        a.setName("Rahul");
        DThread b = new DThread();
        b.setName("Raju");
        DThread c = new DThread();
        c.setName("Om");

        a.start();
        b.start();
        c.start();
    }
}