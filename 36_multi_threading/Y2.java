//if we change priority of parent Thread before making object of child thread that priority is set to child also

class HThread extends Thread {
    public void run() {
        Thread x = Thread.currentThread();

        try{ Thread.sleep(100); } catch(InterruptedException e) { e.printStackTrace(); }
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("A Thread's Info: ");
        System.out.println("Name: " + x.getName());
        System.out.println("ID: " + x.getId());
        System.out.println("Priority: " + x.getPriority());
    }
}

class Y2 {
    public static void main(String[] args) {
        Thread x = Thread.currentThread();
        x.setPriority(2);

        // x.setPriority(8);
        HThread a = new HThread();
        // x.setPriority(8);
        a.setName("A");
        a.start();
        

        System.out.println("Default Thread's Info: ");
        System.out.println("Name: " + x.getName());
        System.out.println("ID: " + x.getId());
        System.out.println("Priority: " + x.getPriority());

    }    
}