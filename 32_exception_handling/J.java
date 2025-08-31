//Exception and Throwable have both checked and unchecked method so we can it in catch
class J{
    public static void main(String[] args){
        try{
            //unchecked exception
            ArithmeticException x = new ArithmeticException();

            throw x;
        } catch(Exception e){

        }
    }
}