//input : <blank> or om or 0 or 1 or 2 or 3
//if there is a parent - child relation between 2 class parameter of catch block 
//the child catch block should be written above the parent always
//if parent is written above child compilation error will come as the child black will never run
class W1{
    public static void main(String[] args){
        try{
            int i = Integer.parseInt(args[0]);

            int[] y = {12, 45, 67};
            System.out.println(y[i]);

            String x = "om";
            System.out.println(x.charAt(i));
        } catch(IndexOutOfBoundsException e){
            System.out.println(e);
            System.out.println("IOBE");
        } catch(NumberFormatException e){
            System.out.println(e);
            System.out.println("NFE");
        } catch(StringIndexOutOfBoundsException e){
            System.out.println(e);
            System.out.println("SIOBE");
        }
    }
}

// W1.java:19: error: exception StringIndexOutOfBoundsException has already been caught
//         } catch(StringIndexOutOfBoundsException e){
//           ^
// 1 error