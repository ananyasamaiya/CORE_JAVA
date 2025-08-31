class E1{
    public static void main(String[] args){
        //some code...

        try{

            // some code ...
        } catch(ArithmeticException e){
            //some code...
        }finally{
            System.out.println("1");
        }

        //some code..
        //some code..
        //some code..
        //some code..
        try{
            int y = 12/0;
            // some code ...
        } catch(NullPointerException e){
            //some code...
        } finally{
            System.out.println("2");
        }

        //some code..
        //some code..
        //some code..
        //some code..
        try{
            
            // some code ...
        } catch(ClassCastException e){
            //some code...
        } finally{
            System.out.println("3");
        }

        //some code..
        //some code..
        //some code..
        //some code..
    }
}