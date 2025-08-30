//CMD arg: true

class O{
    public static void main(String[] args){
        Boolean flag = Boolean.parseBoolean(args[0]);

        // if(args[0]){

        // }

        if(flag){
            System.out.println("Hello");
        } else{
            System.out.println("Hi");
        }
    }
}