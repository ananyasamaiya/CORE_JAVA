//count even number and print odd number
class K{
    public static void main(String[] args){
        int[] x = {45,62,97,23,41,22,81,103};
        int count = 0;

        for(int next : x){
            if(next%2 == 0){
                    count++;
                    continue;
            }
            System.out.println(next);
        }
        System.out.println("Count of even number:" + count);
    }
}