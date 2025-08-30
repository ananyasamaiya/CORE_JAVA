class F{
    public static void main(String[] args){
        System.out.println("start");

        String a = null;
        try{
            System.out.println(a.length());
        }catch(NullPointerException e){
            System.out.println("Some problem");
        }


        System.out.println("end");

    }
}