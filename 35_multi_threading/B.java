class B{
    public static void main(String[] args){
        Thread x = Thread.currentThread();

        System.out.println("Thread Name:" + x.getName());
        System.out.println("Thread ID:" + x.getId());
        System.out.println("Thread Priority:" + x.getPriority());
    }
}