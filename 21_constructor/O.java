class A1{
    void info(){
        System.out.println("info in parent A1");
    }
}

class A2 extends A1{
    void info(){
        System.out.println("info in child A2");
    }
}

class O{
    public static void main(String[] args){
        A1 x = new A2();

        x.info();
    }
}