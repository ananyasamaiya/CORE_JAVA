class A12{
    A12(int y){

    }
}

class Z2 extends A12{
    Z2(){
        super(pro());
    }

    static int pro(){
        return 22;
    }

    public static void main(String[] args){
        Z2 a = new Z2();
    }
}