class W{
    public static void main(String[] args){
        Thread t = new Thread();
        t.start();
        t.start();
    }
}

// Exception in thread "main" java.lang.IllegalThreadStateException
//         at java.base/java.lang.Thread.start(Thread.java:802)
//         at W.main(W.java:5)

//IllegalThreadStateException is child of runtime exception se it is a uncheacked exception