class K {
    public static void main(String[] args) {
        System.out.println("A " + Thread.currentThread().getName());
        Thread x = new Thread() {
            public void run() {
                System.out.println("X " + Thread.currentThread().getName());
                int y = 12 / 0;
                System.out.println("Y " + Thread.currentThread().getName());
            }
        };
        x.setName("Yam");
        x.start();
        System.out.println("B " + Thread.currentThread().getName());
    }    
}