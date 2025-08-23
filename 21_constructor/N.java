class ZA{
    ZA(){
        System.out.println("M");
    }
}
class ZB extends ZA{
    ZB(){
        System.out.println("A");
    }
}
class ZC extends ZB{
    ZC(){
        System.out.println("U");
    }
}
class N{
    public static void main(String[] args){
        System.out.println("R");

        ZC a = new ZC();

        System.out.println("G");
    }
}