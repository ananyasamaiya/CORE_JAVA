//finally will run in every program so it suppress 44 so 99 is printed

class V{
    public static void main(String[] args){
        System.out.println("A");
        
        System.out.println(pro());
        
        System.out.println("B");
    }

    static int pro(){
        try{
            System.out.println("X");

            return 44;
        } finally{
            System.out.println("C");
            return 99;
        }
    }
}