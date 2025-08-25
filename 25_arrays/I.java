//print only even number
class I{
    public static void main(String[] args){
        int[] x = {45,62,97,23,41,22,81,103};

        for(int next : x){
            if(next%2 == 0)
                System.out.println(next);
        }
    }
}