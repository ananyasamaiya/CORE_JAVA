
interface Y1{
    void info();
}

class D1 implements Y1{

    public void info(){

    }
    
    public static void main(String[] args){
    D1 a = new D1();
    
    System.out.println(a.toString());
    System.out.println(a.hashCode());
    }
    
}