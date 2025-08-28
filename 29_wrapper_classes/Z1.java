

class Z1{
    public static void main(String[] args){
        short x = pro();

        System.out.println(x);
    }
    static short pro(){
        Short a = 78;

        //autoboxing: unboxing  a.shortValue
        return a;
    }
}