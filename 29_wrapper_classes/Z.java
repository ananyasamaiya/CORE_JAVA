//here we are returning short variable to Short ref variable here
//autoboxing : boxing
class Z{
    public static void main(String[] args){
        Short x = pro();

        System.out.println(x);
    }
    static Short pro(){
        short a = 56;

        //autoboxing : boxing
        return a;
    }
}