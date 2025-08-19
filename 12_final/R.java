//class ka final hona matlab uska sub class nhi ban sakta (only this is the meaning)
//if w is not final we can modifier it 


final class Y{
    static int w =9;
}

class R{
    public static void main(String[] args)
    {
        System.out.println(Y.w);

        Y.w = 23;

        System.out.println(Y.w);
    }
}