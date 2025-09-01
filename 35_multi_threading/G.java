//From the first start() new thread of execution is made and have start running run() method
// From the second start IllegalThreadStateException is generated in main
// But the first one does not get effected by exception in main
class CThread extends Thread{
    public void run(){
        Thread a = Thread.currentThread();
        for(int i=0; i<30; i++){
            System.out.println(i + " - run() - " + a.getName());
        }
        
    }
}

class G{
    public static void main(String[] args){
        CThread x = new CThread();
        x.setName("golu");
        x.start();
        x.start();

        Thread a = Thread.currentThread();

        for(int i=0; i<30; i++){
            System.out.println(i + " - main() - " + a.getName());
        }
    }
}