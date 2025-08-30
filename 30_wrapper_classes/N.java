// command arg : 2.3

class N{
    public static void main(String[] args){
        Float x = Float.parseFloat(args[0]);

        // System.out.println(args[0] instanceof Float);
        System.out.println(x instanceof Float);
        System.out.println(args[0] instanceof String);
        // System.out.println(args[0] instanceof String[]);
    }
}