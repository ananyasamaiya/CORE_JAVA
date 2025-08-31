class T{
    public static void main(String[] args){
        System.out.println("A");

        if(args.length > 0){
            System.out.println(args[0]);
        }else{
            throw new MissingCommandLineArgumentException("Expected at least a single integer argument...");
        }

        System.out.println("B");
    }
}

class MissingCommandLineArgumentException extends RuntimeException{
    MissingCommandLineArgumentException(){

    }

    MissingCommandLineArgumentException(String message){
        super(message);
    }
}