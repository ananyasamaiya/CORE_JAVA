class YY3{
    YY3(int a){
        System.out.println("Hello");
    }
}

class V3 extends YY3{

    V3(){ 
        super(2); 
    }

    public static void main(String[] args){
        System.out.println("A");
        V3 x = new V3();
        System.out.println("B");
    }
}

