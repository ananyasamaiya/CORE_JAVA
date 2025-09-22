class U1{
    void pro(){
        System.out.println("Hello");
    }
}

class O{
    static U1 x = new U1(){
        void pro(){
            System.out.println("Hi");
        }
    };
    public static void main(String[] args){
        x.pro();
    }
}