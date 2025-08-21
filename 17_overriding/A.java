//overriding
class X1{
    void pro(){
        System.out.println("Hello");
    }
}

class A extends X1{
    void pro(){
        System.out.println("namaskaram");
    }


    public static void main(String[] args){
        A x = new A();

        x.pro();
    }
}