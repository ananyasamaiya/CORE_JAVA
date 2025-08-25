//find largest number

class M{
    public static void main(String[] args){
        int[] x = {45,62,97,23,41,22,81,103};
        
        int max = x[0];

        for(int i=1;i<x.length;i++){
            if(max < x[i]){
                max = x[i];
            }
        }
        System.out.println("Max: "+ max);
    }
}