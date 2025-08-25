//find largest even number and smallest odd no.

class M2{
    public static void main(String[] args){
        int[] x = {45,62,97,23,41,22,81,102};
        
        int max_even = Integer.MIN_VALUE;
        int min_odd = Integer.MAX_VALUE;

        for(int next : x){
            if(next%2 == 0){
                if(next > max_even){
                    max_even = next;
                }
                
            }
            else{
                if (next < min_odd){
                    min_odd = next;
                }
            }

        }
        System.out.println("Max Even no: "+ max_even);
        System.out.println("Min Odd no: "+ min_odd);
    }
}