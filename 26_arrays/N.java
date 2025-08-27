//command line argument :
// >java N mohan verma 12 98.34
// >java N "mohan verma" 12 92.54

class N{
    public static void main(String[] args){
        System.out.println(args);
        System.out.println(args.length);
        
        for(String next : args)
            System.out.println(next);

    }
}