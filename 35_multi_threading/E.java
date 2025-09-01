class AThread extends Thread{
    public void run(){
        Thread a = Thread.currentThread();
        for(int i=0; i<30; i++){
            System.out.println(i + " - run() - " + a.getName());
        }
    }
}

class E{
    public static void main(String[] args){
        AThread x = new AThread();
        x.setName("golu");
        x.start();

        Thread a = Thread.currentThread();

        for(int i=0; i<30; i++){
            System.out.println(i + " - main() - " + a.getName());
        }
    }
}