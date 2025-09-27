class A3{
    //Early Initialization 
    public static A3 x = new A3();

    private A3(){

    }
}

class G {
    public static void main(String[] args){
        A3 x = A3.x;
        A3 y = A3.x;
        A3 z = A3.x;

        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
    }
}