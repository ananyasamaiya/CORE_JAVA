class IThread extends Thread{
    public void run(){
        I1Thread a = new I1Thread();
        a.setName("B");
        a.start();

        Thread  x = Thread.currentThread();

        for(int i=0; i<30; i++){
            if(i == 20){
                try {a.join();} catch(InterruptedException e) { e.printStackTrace();}
            }
            System.out.println(i + " - " + x.getName());
        }
    }
}
class I1Thread extends Thread{
    public void run(){
        I2Thread a = new I2Thread();
        a.setName("C");
        a.start();

        Thread  x = Thread.currentThread();

        for(int i=0; i<30; i++){
            if(i == 20){
                try {a.join();} catch(InterruptedException e) { e.printStackTrace();}
            }
            System.out.println(i + " - " + x.getName());
        }
    }
}
class I2Thread extends Thread{
    public void run(){
       Thread  x = Thread.currentThread();

        for(int i=0; i<100; i++){
            System.out.println(i + " - " + x.getName());
        }
    }
}

class N{
    public static void main(String[] args) throws InterruptedException{
        IThread a = new IThread();
        a.setName("A");
        a.start();

        Thread x = Thread.currentThread();
        for(int i=0; i<30; i++){
            if(i == 20){
                a.join();
            }
            System.out.println(i + " - " + x.getName());
        }
    }
}