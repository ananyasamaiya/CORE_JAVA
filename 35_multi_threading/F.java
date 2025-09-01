// if we call run method instead of start the run method will stack up after main 
// fresh new Thread of execution is not created
class BThread extends Thread{
    public void run(){
        Thread a = Thread.currentThread();
        for(int i=0; i<30; i++){
            System.out.println(i + " - run() - " + a.getName());
        }
        
    }
}

class F{
    public static void main(String[] args){
        BThread x = new BThread();
        x.setName("golu");
        // x.start();
        x.run();

        Thread a = Thread.currentThread();

        for(int i=0; i<30; i++){
            System.out.println(i + " - main() - " + a.getName());
        }
    }
}