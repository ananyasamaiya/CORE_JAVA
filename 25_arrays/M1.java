//find largest even number

class M1{
    public static void main(String[] args){
        int[] x = {45,62,97,23,41,22,81,102};
        
        int max_even = 0;

        for(int next : x){
            if(next%2 == 0){
                if(next > max_even){
                    max_even = next;
                }
            }
        }
        System.out.println("Max Even no: "+ max_even);
    }
}