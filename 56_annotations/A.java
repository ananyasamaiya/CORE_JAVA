class AA{
    void process(){
        System.out.println("Hi");
    }
}

class A extends AA{
    void pracess(){
        System.out.println("Hello");
    }

    public static void main(String[] args){
        A x = new A();
        x.process();
    }
}