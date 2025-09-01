class EThread extends Thread{
    public void run(){
        Thread a = Thread.currentThread();
        for(int i=0; i<100; i++){
            System.out.println(i + " - run() - " + a.getName());
        }
    }
}

class I{
    public static void main(String[] args){
        EThread a = new EThread();
        a.setName("Rahu");
        a.start();

        Thread x = Thread.currentThread();
        for(int i=0; i<30; i++){
            if(i == 15){
                try{
                    Thread.sleep(1000);
                }catch(InterruptedException e){
                    e.printStackTrace();
                }
            }
            System.out.println(i + " - main() - " + x.getName());
        }
    }
}