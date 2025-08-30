class G{
    public static void main(String[] args){
        System.out.println("start");

        int[] arr = {12, 34, 56};
        
        try{
            System.out.println(arr[3]);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Some problem");
        }


        System.out.println("end");
    }
}