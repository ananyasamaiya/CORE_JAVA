//copy reverse element of x into y
class U{
    public static void main(String[] args){
        int[] x = {10,20,30,40,50};
        int[] y = new int[x.length];

        for(int next : y)
            System.out.println(next);

        for(int i=0;i<x.length;i++)
            y[i] = x[x.length-i-1];
        
        // for(int i=0,j=x.length-1;i<x.length;i++,j--)
        //     y[i] = x[j];

        // for(int i=0,j=x.length-1;i<x.length;i++,j--)
        //     y[j] = x[i];

        // int i = 0,j = x.length-1;
        // while(i<x.length)
        //     y[i++] = x[j--];
        
        for(int next : y)
            System.out.println(next);
    }
}