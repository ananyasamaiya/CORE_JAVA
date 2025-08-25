class U1{
    public static void main(String[] args){
        int[][] x = new int[3][];

        System.out.println(x);
        System.out.println(x.length);
        System.out.println("~~~~~~~~~~~~");
        System.out.println(x[0]);
        System.out.println(x[1]);
        System.out.println(x[2]);
        System.out.println(x[0].length);
        
    }
}

// 3
// ~~~~~~~~~~~~
// null
// null
// null
// Exception in thread "main" java.lang.NullPointerException: Cannot read the array length because "<local1>[0]" is null
//         at U1.main(U1.java:11)