//prove variable inside interface is final
interface Y2{
    int w = 5;
}

class L1{
    public static void main(String[] args){
        System.out.println(Y2.w);

        Y2.w = 234; 
        //interface variable a is implicitly final
        
        System.out.println(Y2.w);

    }
}