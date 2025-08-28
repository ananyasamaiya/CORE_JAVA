//here we are passing byte value to Byte ref variable here 
//autoboxing : boxing is done

class X{
    public static void main(String[] args){
        byte a = 34;

        //autoboxing: boxing
        pro(a);
    }
    static void pro(Byte x){
        System.out.println(x);
    }
}

