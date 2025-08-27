//command line argument :
// >java M mohan 12 95.23

class M{
    public static void main(String[] args){
        System.out.println(args);
        System.out.println(args.length);
        
        for(String next : args)
            System.out.println(next);
        
        int age = Integer.parseInt(args[1]);
        System.out.println(args[1] + 2);
        System.out.println(age + 2);

    }
}