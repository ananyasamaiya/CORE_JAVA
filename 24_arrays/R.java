//for each loop
class R{
    public static void main(String[] args){
        //String[] x = new String[] {};
        // String[] x = new String[] {"ram", "om", "raju", "mohan"};
        String[] x ={"golu", "bholu", "raju", "mohan","om"};

        System.out.println(x.length);

        // Classic for loop
        // for(int j=0;j<x.length;j++)
        //     System.out.println(x[j]);

        // Enhanced for loop(for each)
        for(String next : x)
            System.out.println(next + " ^");

    }
}