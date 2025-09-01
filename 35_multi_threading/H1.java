class D1Thread extends Thread{
    public void run(){
        Thread a = Thread.currentThread();
        for(int i=0; i<30; i++){
            System.out.println(i + " - run() - " + a.getName() + "  - " + a.getId());
        }
    }
}

class H1{
    public static void main(String[] args){
        D1Thread a = new D1Thread();
        // a.setName("Rahul");
        D1Thread b = new D1Thread();
        // b.setName("Raju");
        D1Thread c = new D1Thread();
        // c.setName("Om");

        a.start();
        b.start();
        c.start();
    }
}